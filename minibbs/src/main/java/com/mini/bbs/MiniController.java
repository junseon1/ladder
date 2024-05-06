package com.mini.bbs;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mini.bbs.jjap.UserService;

@Controller
public class MiniController {
	@Autowired UserService userService;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="join", method=RequestMethod.GET)
	public ModelAndView join() {
		return new ModelAndView("user/join");
	}
	@RequestMapping(value="join", method=RequestMethod.POST)
	public ModelAndView joinPost(@RequestParam Map<String, Object>map) {
		ModelAndView mav = new ModelAndView();
		
		String seq = this.userService.join(map);
		if(seq == null) {
			mav.setViewName("redirect:/join");
		}else {
			mav.setViewName("redirect:/mypage?seq="+seq);
		}
		return mav;
	}
	/*model view를 합친것이다 */
	
	@RequestMapping(value="forgot", method=RequestMethod.GET)
	public ModelAndView forgot() {
		return new ModelAndView("user/forgot");
	}
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("user/login");
	}
	
	@RequestMapping(value="mypage", method = RequestMethod.GET)
	public ModelAndView mypage(@RequestParam Map<String, Object>map) {
		
		Map<String, Object> mypageMap = this.userService.mypage(map);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", mypageMap);
		
		String seq = map.get("seq").toString();
		mav.addObject("seq", seq);
		mav.setViewName("user/mypage");
		
		return mav;
	}//@RequestParam 어노테이션에 의해 쿼리 스츠링 파라미터를 읽을수 있다, 스프링은 http메소드를 구분하지 않고 파라미터를 GET POST동일한 방법으로 읽을수 있게 합니다
	
	@RequestMapping(value="list", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam Map<String, Object>map) {
		
	List<Map<String, Object>> list = this.userService.list(map);
	
	ModelAndView mav = new ModelAndView();
	mav.addObject("data", list);
	
	//add search
	if (map.containsKey("keyword")) {//목록페이지에는 HTTP파라미터가 있을수도 있고 없을수도 있어서 따라서 파라미터가 있는지 검색한다
	mav.addObject("keyword",map.get("keyword"));//파라미터에 있다면 뷰에 키워드를 전달한다
	}
	
	
	mav.setViewName("/user/list");
		return mav;
	}
	
	//update 수정화면은 입력화면 + 상세화면이다 입력화면의 형식을 그대로 따라가지만 데이터베이스에 저장된 데이터만 그려주면 된다
	
	@RequestMapping(value="/update", method = RequestMethod.GET)
	public ModelAndView update(@RequestParam Map<String, Object>map) {
	Map<String, Object> mypageMap = this.userService.mypage(map);
	
	ModelAndView mav = new ModelAndView();
	mav.addObject("data", mypageMap);
	mav.setViewName("/user/update");
	return mav;
	}
	
	//update 수정기능
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public ModelAndView updatePost(@RequestParam Map<String, Object>map) {	
	ModelAndView mav = new ModelAndView();
	
	boolean isUpdateSuccess = this.userService.edit(map);
	if (isUpdateSuccess) {
	String seq = map.get("seq").toString();
	mav.setViewName("redirect:/mypage?seq="+seq);
	}else {
	mav = this.update(map);	
	}
	return mav;
	}
	
	//delete메소드
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public ModelAndView deletePost(@RequestParam Map<String, Object>map) {	
	ModelAndView mav = new ModelAndView();
	
	boolean isDeleteSuccess = this.userService.remove(map);
	if (isDeleteSuccess) {
	mav.setViewName("redirect:/list");
	}else {
	String seq  = map.get("seq").toString();
	mav.setViewName("redirect:/mypage?seq="+seq);
	}
	return mav;
	}
	
	@RequestMapping(value="ladder", method=RequestMethod.GET)
	public ModelAndView ladder() {
		return new ModelAndView("user/ladder");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

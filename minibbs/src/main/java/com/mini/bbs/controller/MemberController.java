package com.mini.bbs.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mini.bbs.domain.MemberVO;
import com.mini.bbs.service.MemberService;

@Controller
@RequestMapping(value="/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService service;
	
	
	@Autowired //spring security 프레임워크에서 제공하는 클래스로 비밀번호를 암호화(해시)하는데 사용한다.
	BCryptPasswordEncoder passEncoder;
	
	//add
	@Bean
	BCryptPasswordEncoder passEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	//회원가입 GET 
	@RequestMapping(value="signup", method = RequestMethod.GET)
	public void signupGET() throws Exception{
		logger.info("get signup");
	}
	
	//회원가입 POST
	@RequestMapping(value="signup", method = RequestMethod.POST)
	public String postSignup(MemberVO vo) throws Exception{
		logger.info("post signup");
		
		String inputPass = vo.getUserPass();
		String pass = passEncoder.encode(inputPass);
		vo.setUserPass(pass);
		
		String inputPass2 = vo.getUserPassRe();
		String pass2 = passEncoder.encode(inputPass2);
		vo.setUserPassRe(pass2);
		
		service.signup(vo);
		
		return "redirect:/";
	}
	
	//로그인 get
	@RequestMapping(value="signin", method = RequestMethod.GET)
	public void signinGET() throws Exception{
		logger.info("get signin");
	}
	
	//로그인 post
	@RequestMapping(value="signin", method = RequestMethod.POST)
	public String postSignin(MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
		logger.info("post signin");
		
		MemberVO login= service.signin(vo);
		HttpSession session = req.getSession();
			
		boolean passMatch = passEncoder.matches(vo.getUserPass(), login.getUserPass());

		//passMatch는 사용자가 입력한 패스워드와 DB에 저장된 패스워드를 비교해서 동일하면 true, 아니면 false
		//login에 값이 없는 경우는 아이디를 잘못 입력한 경우이므로 아이디나 패스워드가 모두 맞아야 session이 실행
		
		if(login != null && passMatch ) {
			session.setAttribute("member", login);
		}else {	//아이디나 패스워드 둘중에 하나라도 틀리다면 로그인 성공하기 전으로 
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
			return "redirect:/member/signin";
		}
		
		return "redirect:/";
	}
	
	
	//로그아웃
	@RequestMapping(value="signout", method = RequestMethod.GET)
	public String signout(HttpSession session) throws Exception{
		logger.info("get logout");
		
		service.signout(session);
		
		return "redirect:/";
	}
	
	//ladder get
		@RequestMapping(value="ladder", method = RequestMethod.GET)
		public void ladderGet() throws Exception{
			logger.info("get ladder");
		}
}

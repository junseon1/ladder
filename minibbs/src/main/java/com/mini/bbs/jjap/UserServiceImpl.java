package com.mini.bbs.jjap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired //-자동의존성주입
	UserDao userDao;
	
	//입력기능 서비스 메소드 클래스 생성은 재정의로 한다
	@Override //-재정의
	public String join(Map<String, Object>map) {
		int affectRowCount = this.userDao.insert(map);
		if (affectRowCount == 1) {
			return map.get("seq").toString();
		}
		return null;
	}
	
	@Override
	public Map<String, Object> mypage(Map<String, Object>map){
		return this.userDao.selectMypage(map);
	}
	
	//리스트
	@Override
	public List<Map<String, Object>> list(Map<String, Object>map){
		return this.userDao.selectList(map);
	}
	
	//에디트
	@Override
	public boolean edit(Map<String, Object>map) {
		int affectRowCount = this.userDao.update(map);
		return affectRowCount == 1;
	}
	
	//삭제
	@Override
	public boolean remove(Map<String, Object>map) {
		int affectRowCount = this.userDao.delete(map);
		return affectRowCount == 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//서비스 클래스는 비즈니스 클래스가 위치하는 곳이다 스프링 mvc구조에서 서비스 클래스는 컨트롤러와 다오를 연결하는 역활을 한다
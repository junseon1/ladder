package com.mini.bbs.jjap;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	//입력기능 dao매소드 생성
	public int insert(Map<String, Object>map) {
		return this.sqlSessionTemplate.insert("miniuser.insert",map);
	}
	
	//mypage dao매소드 작성
	public Map<String, Object> selectMypage(Map<String, Object>map){
		return this.sqlSessionTemplate.selectOne("miniuser.select_mypage", map);
		//selectOne 쿼리결과가 1개일때 없으면 null 많으면 너무많은 에러를 호출한다
	}
	
	//list 메소드 작성
	public List<Map<String, Object>> selectList(Map<String, Object>map){
		return this.sqlSessionTemplate.selectList("miniuser.select_list", map);
	}
	
	//update 메소드 작성
	public int update(Map<String, Object>map) {
		return this.sqlSessionTemplate.update("miniuser.update", map);
	}
	
	//user삭제 메소드 
	public int delete(Map<String, Object>map) {
		return this.sqlSessionTemplate.delete("miniuser.delete", map);
	}
}
	
	

























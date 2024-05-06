package com.mini.bbs.jjap;

import java.util.List;
import java.util.Map;

public interface UserService {

	String join(Map<String, Object> map);//메소드 시그니처

	Map<String, Object> mypage(Map<String, Object> map);//서비스 인터페이스 메소드 시그니처

	List<Map<String, Object>> list(Map<String, Object> map);//

	boolean edit(Map<String, Object> map);

	boolean remove(Map<String, Object> map);

}

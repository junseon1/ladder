package com.mini.bbs.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mini.bbs.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject	//Autowired와 유사하고 주입하려고 하는 객체의 타입이 일치하는 객체를 자동으로 주입
	private SqlSession sql;
	
	//mapper는 모델이나 xml에서 namespace가 동일해야한다
	private static String namespace = "member";
	
	//회원가입
	@Override
	public void signup (MemberVO vo) throws Exception {
		sql.insert(namespace + ".signup", vo);
	}
	
	//로그인
	@Override
	public MemberVO signin (MemberVO vo) throws Exception {
		return sql.selectOne(namespace + ".signin", vo);
	}
	
}

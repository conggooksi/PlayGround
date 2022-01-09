package semiproject.service;

import javax.servlet.http.HttpSession;

import semiproject.vo.MemberVO;

public interface MemberService {

	void joinMember(MemberVO mvo);

	boolean loginMember(MemberVO mvo);

	Object readOneMember(HttpSession sess);
	
}

package semiproject.dao;

import semiproject.vo.MemberVO;

public interface MemberDAO {

	int insertMember(MemberVO mvo);

	int selectLoginMember(MemberVO mvo);

	Object selectOneMember(String userid);
	
}

package mc.sn.main.member.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mc.sn.main.member.dao.MemberDAO;
import mc.sn.main.member.vo.MemberVO;

@Service("memberService")
@Transactional(propagation = Propagation.REQUIRED)
public class MemberService {
	
	
	@Autowired
	private MemberDAO memberDAO;
	
	
	public MemberVO login(MemberVO memberVO) throws Exception{
		MemberVO vo = null;
		vo = memberDAO.loginById(memberVO);
		return vo;
	}
}

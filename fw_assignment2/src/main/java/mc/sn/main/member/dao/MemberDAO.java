package mc.sn.main.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import mc.sn.main.member.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAO {
	@Autowired
	private SqlSession sqlSession;
	
	public MemberVO loginById(MemberVO memberVO) throws DataAccessException{
		MemberVO vo = null;
		vo = sqlSession.selectOne("mapper.member.loginById",memberVO);
		return vo;
	}
}

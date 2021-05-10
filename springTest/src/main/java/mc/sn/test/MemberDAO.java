package mc.sn.test;

import java.util.List;

import org.springframework.dao.DataAccessException;

import mc.sn.test.*;

public interface MemberDAO {
//	 public List selectAllMemberList() throws DataAccessException;
//	 public int insertMember(MemberVO memberVO) throws DataAccessException ;
//	 public int deleteMember(String id) throws DataAccessException;
	 public MemberVO loginById(MemberVO memberVO) throws DataAccessException;

}

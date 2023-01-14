package io.ideatags.web.springmvcweb.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.ideatags.web.springmvcweb.dao.MemberDao;
import io.ideatags.web.springmvcweb.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {
	
	/*
	 * 비추천 방식 
	@Autowired
	private MemberDao memberDao; 
	*/
	
	private final MemberDao memberDao; 
	
	public MemberServiceImpl(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Override
	public List<MemberVo> getMemberList(int userNo) {
		// TODO Auto-generated method stub
		return memberDao.getMemberList(userNo);
	}

	@Override
	public int setMember(MemberVo vo) {
		// TODO Auto-generated method stub
		return memberDao.setMember(vo);
	}

	@Override
	public List<MemberVo> getMemberListAll(MemberVo vo) {
		// TODO Auto-generated method stub
		return memberDao.getMemberListAll(vo);
	}

}

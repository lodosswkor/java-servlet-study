package io.ideatags.web.springmvcweb.service.member;

import java.util.List;

import io.ideatags.web.springmvcweb.vo.MemberVo;

public interface MemberService {
	List<MemberVo> getMemberList(int userNo);
	int setMember(MemberVo vo); 
	List<MemberVo> getMemberListAll(MemberVo vo);
}

package io.ideatags.web.springmvcweb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import io.ideatags.web.springmvcweb.vo.MemberVo;

@Mapper
public interface MemberDao {
	List<MemberVo> getMemberList(int userNo);
	int setMember(MemberVo vo); 
}

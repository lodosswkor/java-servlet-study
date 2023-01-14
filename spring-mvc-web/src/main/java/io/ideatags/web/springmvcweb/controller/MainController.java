package io.ideatags.web.springmvcweb.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.ideatags.web.springmvcweb.dao.MemberDao;
import io.ideatags.web.springmvcweb.vo.MemberVo;

@Controller
public class MainController {

	
	@Autowired 
	private MemberDao memberDao;  // DI (Dependency Injection)
	
	
	@GetMapping(value={"","/"})
	@ResponseBody
	public List<MemberVo> index(@RequestParam("userNo") int userNo) {
		List<MemberVo> result = memberDao.getMemberList(userNo); 
		return result;
	}
	
	@RequestMapping("index2.do")
	@ResponseBody
	public String index2() {
		return "하악하악";
	}
	
	@GetMapping("/main.nhn")
	public String main() {
		return "main"; 
	}
	
}

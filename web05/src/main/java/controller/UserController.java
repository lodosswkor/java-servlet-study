package controller;
import vo.WebUser;
import java.util.List;

import repository.UserRepository; 


//-- 비지니스 로직 
//-- useBean jsp 실행시 자동생성
// Object 클래스의 자식

public class UserController {
	
	
	List<WebUser> userRepository; 
	
	// 디폴트 생성자를 호출한다(useBean) 
	// 접근한정자 클래스명(매개변수) {} 
	public UserController() {
		//System.out.println("자네왔는가?");
		this.userRepository = UserRepository.getUserRepository();
	}
	
	// 1. 회원데이터 입력 
	public boolean addUser(WebUser user) {	 
		// add 가 성공하면 true 
		// add 가 실패하면 false 
		return this.userRepository.add(user); 
	}
	
	// 2. 회원아이디 체크 
	
	// 3. 회원 목록 들고오기 
	public List<WebUser> getUserListAll() {
		return this.userRepository;
	}
	
	// 4. 회원 삭제 
	
	//......

}

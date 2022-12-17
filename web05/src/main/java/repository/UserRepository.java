package repository;

import java.util.List;
import java.util.ArrayList;
import vo.WebUser;

// 싱글턴 패턴 
public class UserRepository {

    private static List<WebUser> userRepository; 
    
    public static List<WebUser> getUserRepository() {
    	
    	if(userRepository == null) {
    	   System.out.println("userRepository 생성");
    	   userRepository = new ArrayList<WebUser>(); // 디폴트 생성자 
    	}
    	
    	return userRepository;
    }
    
}

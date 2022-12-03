package vo;

//import java.util.*; 
import java.util.Date; 

public class CreationObjectVO {

	private String creationDate; 
	
	//-- 기본 생성자 
	//-- CreationOjectVO vo = new CreationOjectVO(); 
	public CreationObjectVO() {
		this.creationDate = new Date().toString();
	}
	
	//--- 생성시간 가지고 오기 
	public String getCreationDate() { 
		return this.creationDate; 
	}
	
}

package vo;

import java.io.Serializable;

//-- 웹 유저 객체 
public class WebUser implements Serializable {

	//-- 아이디
	private String webId;
	//-- 이름 
	private String webName;
	//-- 비밀번호 
	private String webPwd; 
	//-- 전화번호 
	private String webCel; 
	//-- 이메일 
	private String webEmail;
	//-- 자기소개 
	private String webIntroduce; 
	
	public String getWebId() { 
		return this.webId; 
	}
	
	public void setWebId(String webId) {
		this.webId = webId;
	}

	public String getWebName() {
		return webName;
	}

	public void setWebName(String webName) {
		this.webName = webName;
	}

	public String getWebPwd() {
		return webPwd;
	}

	public void setWebPwd(String webPwd) {
		this.webPwd = webPwd;
	}

	public String getWebCel() {
		return webCel;
	}

	public void setWebCel(String webCel) {
		this.webCel = webCel;
	}

	public String getWebEmail() {
		return webEmail;
	}

	public void setWebEmail(String webEmail) {
		this.webEmail = webEmail;
	}

	public String getWebIntroduce() {
		return webIntroduce;
	}

	public void setWebIntroduce(String webIntroduce) {
		this.webIntroduce = webIntroduce;
	}
	
	
	
	
}

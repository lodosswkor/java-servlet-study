package dao;

import vo.MemberVo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import repository.MysqlConnection;

public class MemberDaoImpl implements MemberDao {

	private MysqlConnection mysqlConn = new MysqlConnection(); 
	private static MemberDaoImpl memberDao = null;
	
	// memberDao는 함수(메서드) 행위만 중개하기 때문에, 
	// Application션당 객체 하나만 생성 후 공유하는게 좋다. ( 싱글턴 ) 
	public static MemberDaoImpl getMemberDao() {
		if(memberDao == null) {
			memberDao = new MemberDaoImpl();
		}
		return memberDao; 
	} 
	
	
	@Override
	public int insertMember(MemberVo member) throws Exception {
		
		//1. 커넥션 객체를 얻음 
		Connection conn = mysqlConn.getConnection(); 
		//2. 쿼리 기본형 만들기 
		String sql = "insert into members (userName, userEmail, userPwd) values (?,?,?);";
		//3. PreparedStatement 생성 (Auto_Increment Key를 리턴받겠습니다.) 
		PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, member.getUserName());
		pstmt.setString(2, member.getUserEmail());
		pstmt.setString(3, member.getUserPwd());
		int result = pstmt.executeUpdate(); // 0이거나 0이하면 실패
		
		//4. 인서트 후 자동생성된 userNo컬럼의 값을 들고오고 싶다. 
		ResultSet rs = pstmt.getGeneratedKeys();
		int userNo = (rs.next()) ? rs.getInt(1) : 0;
		
		//5. MemberVo의 userNo 프로퍼티에 값 넣기 
		member.setUserNo(userNo);
		//-- 저장프로세스 끝 
		
		rs.close(); 
		pstmt.close(); 
		conn.close(); 
		return result;
	}

	@Override
	public boolean loginUser(MemberVo member) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	//-- 아이디(이메일)중복 확인  
	//-- false 중복아님, true 중복 
	@Override
	public boolean checkUserDuplicated(MemberVo member) throws Exception {
		
		//1. conn
		Connection conn = mysqlConn.getConnection();
		
		//2. SQL 템플릿생성 
		String sql = "select count(*) from members where userEmail = ?";  
		
		//3. PreparedStatement 
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.getUserEmail());
		
		//4. 실행 
		ResultSet rs = pstmt.executeQuery(); 
		
		//5. rows 꺼내오기 
		int resultCnt = (rs.next()) ? rs.getInt(1) : -1;
		
		// 자원반납 
		rs.close();
		pstmt.close();
		conn.close(); 
		
		// 중복이 있으면 true, 없으면 false 
		return resultCnt > 0;
	}

}

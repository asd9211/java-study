package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	static void exceptionTest() throws Exception{
		
	}
	public static void main(String[] args) {
		try {
			exceptionTest();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		try {
			Connection con = DriverManager.getConnection(url, id, pwd); // 오라클에 전화연결
			Statement stmt = con.createStatement();
			String sql = "select * from board"; //쿼리박스에 실제로 쓰는 명령어. 그것들의 데이터타입은 String이니깐 여기서 바로 입력.
			ResultSet rs = stmt.executeQuery(sql); // 실행하다. , rs는 데이터와 메타데이터를 가지고 있다.
			while(rs.next()) {    // while 문은 false가 나올때까지 돈다. 여기선 끝이나면 false로 인식.!
				System.out.print(rs.getString("num")+",");
				System.out.print(rs.getString("title")+",");
				System.out.print(rs.getString("reg_date")+",");
				System.out.print(rs.getString("content")+",");
				
				
			}
			System.out.println("연결 성공!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 어떤 오류인지 출력해주는 구문이다.
		}
	}
}

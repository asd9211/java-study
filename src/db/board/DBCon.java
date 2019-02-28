package db.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; //fianl 이라면 안에 변수를 대문자로 써라.
	private static final String USER = "osfu";
	private static final String PASSWORD = "12345678";
	private static Connection con;
	
	DBCon(){
		
	}
	public static Connection getCon() {
		if(con==null) {
			try {
				con = DriverManager.getConnection(URL, USER, PASSWORD); //전화기 사고 통화건것.
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
	public static void close() {
		if(con!=null) {
			try {
				con.close(); // 통화종료
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		con = null; // 전화기를 없애버린것.
		System.out.println(con);
	}
	
	public static void main(String[] args) {
		getCon(); // 전화기 사고 통화걸기 실행
		close(); // 통화끄고 전화 없애기 실행
	}
}

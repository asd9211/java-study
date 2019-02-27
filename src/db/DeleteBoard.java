package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteBoard {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		
			try {
				con = DriverManager.getConnection(url, id, pwd);  // 전화연결
				String sql = "delete from board_info where bi_num=?"; // 쿼리문 변해지는 값은 ? 로 만든다. 먼저 파싱해서 읽어드린다.
				
				PreparedStatement ps = con.prepareStatement(sql); // prepare에서 sql을 읽은 것을 이제 ps에 대입하면 ps는 준비가 끝나기때문에 prepared이다.
				ps.setInt(1, 1);
				int cnt = ps.executeUpdate(); // Insert, delete 등은 execute update로 해야한다. execute query 도 된다. 하지만 뭐가 삭제되고 추가되었는지를 볼 수 없다.
				if(cnt==1) {
					System.out.println("삭제잘됨");
				}else {
					System.out.println("어림도없다 돌아가");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
}

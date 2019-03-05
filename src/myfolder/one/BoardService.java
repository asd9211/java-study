package myfolder.one;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardService {

	public void selectBoard() {
		String sql = "select * from board_info";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("제목");
			while (rs.next()) {
				System.out.println(rs.getString("bi_title"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBCon.close();
			
		}
	}
	
	public void insertBoard(String title, String content) {
		String sql = "insert into board_info(bi_num, bi_title," + " bi_content, bi_credat, bi_cretim)";
		sql += " values(seq_bi_num.nextval,?,?,TO_CHAR(SYSDATE,'YYYYMMDD'),TO_CHAR(SYSDATE,'HH24MISS'))";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("정상적으로 게시물이 등록 완료!");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
	
	public void updateBoard(String title, String content, String num) {
		int biNum = Integer.parseInt(num);
	}
}

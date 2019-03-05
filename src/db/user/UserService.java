package db.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;
import db.board2.BoardInfoVO;

public class UserService {

	public List<UserInfoVO> selectUser() { // UserInfoVO 리스트라는 데이터타입을 가진 selectUSer라는 메소드를 만든다.
		String sql = " select * from user_info"; // sql에 모든 정보를 조회할 수 있는 명령어를 집어넣는다.
		Connection con = DBCon.getCon(); // DB에 전화를 건다.

		try {
			PreparedStatement ps = con.prepareStatement(sql); //sql에 넣은 모든 정보조회 명령어를 실행히켜이제 준비시킨다.
			ResultSet rs = ps.executeQuery(); // 결과가 나온것을 이제 쿼리를 실행해서 본다.
			List<UserInfoVO> userList = new ArrayList<>(); // 이것을 이제 이클립스에서도 담아야하기때문에 리스트를 만든다.
			while (rs.next()) { // 반복문을 돌려 하나하나 입력해서 리스트를 채운다.
				UserInfoVO ui = new UserInfoVO(); 
				ui.setUiNum(rs.getInt("ui_num"));
				ui.setUiName(rs.getString("ui_name"));
				ui.setUiId(rs.getString("ui_id"));
				ui.setUiPwd(rs.getString("ui_pwd"));
				ui.setUiEmail(rs.getString("ui_email"));
				userList.add(ui);
			}
			return userList;

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}

	public List<BoardInfoVO> selectBoard(BoardInfoVO bivo) { // BoardInfoVO 리스트라는 데이터타입을 가진 selectBoard라는 메소드를 만든다. 
																//이것의 매개변수는 BoardInfoVO인 bivo를 가진다.
		
		String sql = "select bi.*, ui.ui_name from " + " board_info bi, user_info ui " + " where bi.ui_num=ui.ui_num";
		if (bivo.getBiTitle() != null) {
			sql += " and bi.bi_title=?";
		}
		if (bivo.getBiContent() != null) {
			sql += " and bi.bi_content=?";
		}
		if (bivo.getUiName() != null) {
			sql += " and ui.ui_name=?";
		}
		Connection con = DBCon.getCon();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			if (bivo.getBiTitle() != null) {
				ps.setString(1, bivo.getBiTitle());
			}
			if (bivo.getBiContent() != null) {
				ps.setString(1, bivo.getBiContent());
			}
			if (bivo.getUiName() != null) {
				ps.setString(1, bivo.getUiName());
			}
			ResultSet rs = ps.executeQuery();
			List<BoardInfoVO> boardList = new ArrayList<>();
			while (rs.next()) {
				BoardInfoVO bi = new BoardInfoVO();
				bi.setBiNum(rs.getInt("bi_num"));
				bi.setBiTitle(rs.getString("bi_title"));
				bi.setBiContent(rs.getString("bi_content"));
				bi.setBiCredat(rs.getString("bi_credat"));
				bi.setBiCretim(rs.getString("bi_cretim"));
				bi.setBiIsactive(rs.getString("bi_isactive"));
				bi.setUiNum(rs.getInt("ui_num"));
				bi.setUiName(rs.getString("ui_name"));
				boardList.add(bi);
			}
			return boardList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

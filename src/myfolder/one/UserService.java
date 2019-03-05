package myfolder.one;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import db.user.UserInfoVO;

public class UserService {

	public List<UserInfoVO> selectUser(UserInfoVO uivo) {
		String sql = " select * from user_info where 1=1";
		if (uivo != null) {
			if (uivo.getUiId() != null) {
				sql += " and ui_id=?";
			}
			if (uivo.getUiName() != null) {
				sql += " and ui_name=?";
			}
		}
		Connection con = DBCon.getCon();
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			if (uivo != null) {
				if (uivo.getUiId() != null) {
					ps.setString(1,  uivo.getUiId());
				}else {
					ps.setString(2, uivo.getUiName());
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}

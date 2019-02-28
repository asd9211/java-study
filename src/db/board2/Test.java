package db.board2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;

public class Test {

	public static void main(String[] args) {
		String sql = " select * from board_info";
		Connection con = DBCon.getCon(); // 여기서 겟콘과 콘은 같아. 같은곳을 보니까. 디비콘과 연결
		System.out.println("연결성공!");
		try {
			PreparedStatement ps = con.prepareStatement(sql); //()안에 준비할 데이터명을 입력. 보드에있는걸 모두 조회하는 걸 준비해라
			ResultSet rs = ps.executeQuery(); //rs가 쿼리박스의 데이터를 본다. 하지만 첫번째줄을 아직 읽고있지 않기 떄문에 시야를 내려야한다.
												// 이 시야를 내리는게 rs.next() 이다.
			List<BoardInfoVO> biList = new ArrayList<>(); //배열은 인덱스를 정해야해서 추가할때 빡시다. 그래서 어레이 리스트로 공간을 만들자. BoardInfoVO 안에 있는 변수들이 여기서 while문으로 돌아가니깐 저걸 데이터타입으로 지정하는거다.
			while(rs.next()) {
			BoardInfoVO bi = new BoardInfoVO(); // 한개의 bi는 전체로우가 하닌 한줄에 대한 bi이다.
			bi.setBiNum(rs.getInt("bi_num")); // 처음에 싹다 널이다. rs.genInt(bi_num)이 쿼리박스에 있는걸 불러와서 셋비아이 넘에 넣는것이다. 이런거 다 각각 호출해서 bi가가지고 있는 변수에 집어넣었다.
			bi.setBiTitle(rs.getString("bi_title"));
			bi.setBiContent(rs.getString("bi_content"));
			bi.setBiCredat(rs.getString("bi_credat"));
			System.out.println(bi); // while 한바퀴 돌고나면 한줄에 대한 정보가 다없어지고 다음 줄로간다. 그래서 전체를 보고싶은데 이 방법은 1. 배열과 2.어레이 리스트 두개이다. 보드 인포의 정보들을 이 두개에 집어 넣어서 전체를 볼 수 있게 만든다.
			}						
			for(BoardInfoVO bi : biList) {
				System.out.println(bi);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBCon.close(); // (try부터 e.printStack 까지없을때의 상황임)전화기를 끊고 해지까지 한 상황. 
		System.out.println(con);	// 얜 해지 안됐음 왜? ex) 휴대폰하나의 번호를 그대로 다른폰에 복제해서 심는다. 하나에서 오라클에서 걸면 다른 폰에서 오라클에 걸린다. 그리고 한쪽폰은 전화를 끊고 폰을 버렸다. 하지만 복제된 폰은 전화는 끊켰어도 버려지진 않았잖아. 그래서 주소값이 나오는 거다.
	}
}

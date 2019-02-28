package db.board2;

import java.util.List;

public class Testt {

	public static void main(String[] args) {
		BoardService bs = new BoardService();
		List<BoardInfoVO>biList = bs.selectBoard();

		System.out.println(biList);

		BoardInfoVO bi = new BoardInfoVO();
		

	}
}

package myfolder;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		BoardService bs = new BoardService();
		List<BoardInfoVO> biList = bs.selctBoard(); //선택한 영역들을 이제 반복문으로 돌려라
		
		System.out.println(biList);
	}
}

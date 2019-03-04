package myfolder;

import db.board2.BoardInfoVO;

public class Generic {

		public static<T> T printSome(T o) {
			System.out.println(o);
			return o;
		}
		public static void main(String[] args) {
			BoardInfoVO bi = new BoardInfoVO();
			bi.setBiNum(1);
			bi = printSome(bi);
			
		
		}

}


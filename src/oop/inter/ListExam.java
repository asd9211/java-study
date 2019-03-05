package oop.inter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExam {

	public ArrayList<String> selectArrayList(){
		return new ArrayList<>(); //이것밖에안됨. 왜? ArrayList<String>이 데이터타입이니깐 이것만을 가지고 있어야하니깐.
	}
	
	public LinkedList<String> selectLinkedList(){
		return new LinkedList<>();
	}
	public List<String> selectList(){
		return new ArrayList<>();
		//return new LinkedList<>(); // 리스트는 구현하기에 따라 다르니깐 둘다 가능함. 
	}
}

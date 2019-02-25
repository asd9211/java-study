package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExam3 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>(); // new ArrayList<>();은 List가 가지고 있는 a,b,c 등 모든 메소드를 가지고 있다. 
		List<String> ll=new LinkedList<>();
		List<String> v = new Vector<>();
		System.out.println(al);
		System.out.println(ll);
		System.out.println(v);
		
		al.add("1");
		ll.add("1");
		v.add("1");
		
		System.out.println(al);
		System.out.println(ll);
		System.out.println(v);
		
	}
}

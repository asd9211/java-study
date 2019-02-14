package oop;

public class ClassExam2 {
	String[] strs;
	int num;
	double db;
	boolean bl;
	char c;
	
	
	public static void main(String[] args) {
		ClassExam2 ce=new ClassExam2();
		System.out.println(ce.strs);
		System.out.println(ce.num);
		System.out.println(ce.db);
		System.out.println(ce.bl);
		System.out.println(ce.c); // 정해져있지 않은 데이터타입은 전부 null로 나온다.
		
	}
}

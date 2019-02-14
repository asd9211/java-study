package oop;

public class ThisExam2 {
	int num1;
	String str;
	
	 ThisExam2(){}
	
	ThisExam2(int num1, String str){
		this.num1 = num1;
		this.str = str;
		System.out.println(this.num1); //밑에서 저값을 넣어봤자 this는 이클래스 위에 변수 이기때문에 0과 null이 나온다.
		System.out.println(this.str);
		
	}
	
	
	
	public static void main(String[] args) {
			ThisExam2 te = new ThisExam2(10,"abc");
	}
}

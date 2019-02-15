package oop.inherit;

public class Final {
	final int num; //final은 바꿀 수 없음. 상수임.
	Final(){
		num=3;
	}
	public static void main(String[] args) {
		Final f = new Final();
		System.out.println(f.num);
		f.num=3; //변수는 final때문에 고정되어 있어서 바꿀수없음.
	}
}

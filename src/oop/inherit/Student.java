package oop.inherit;

class People{ //class 앞에도 final을 붙이면 상속 불가능, 이자체로 최종판이기때문에 상속이 안됨.
	String name;
	People(){
		this("무명");
	}
	People(String name){
		this.name = name;
	}
}
public class Student extends People {
	int grade;
	Student(int grade){   //생성자는 오버로딩은 되나, 오버라이딩은 안됨.
		//super(); 이 숨겨져있음. 왜...?  
		this.grade = grade;
	}
	
	final void printInfo() { //final로 정의했기때문에 오버라이딩 조건이 충분해도 뒤에서 오버라이딩이 불가함.
		System.out.println("학년 : " + grade);
		System.out.println("이름 : " + name);
	}
	public static void main(String[] args) {
		Student st = new Student(3);
		st.printInfo();
		
	}
}

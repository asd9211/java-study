package oop.inherit;

import java.util.Scanner;

class Book {
	String name;

	Book(String name) {
		this.name = name;

	
	}

	Book() { // 기본생성자가 없을 경우, 밑에서 호출이 안되기떄문에 기본생성자를 따로 만들었음.
		this("자바의 정석"); // =this.name = "자바의정석";
	}
}

public class ConsExam extends Book {
	ConsExam(){
		super();
		}
	
	public static void main(String[] args) {
		ConsExam ce = new ConsExam();
		System.out.println(ce.name);

	}
}

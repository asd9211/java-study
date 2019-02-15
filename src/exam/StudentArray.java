package exam;

class Student{
	String name;
	int grade;
	String schoolName;
	
}

public class StudentArray {

	public static void main(String[] args) {
		
		Student[] students = new Student[10];
		for (int i = 0; i < students.length; i++) {

			students[i] = new Student(); // 0~9번방까지 new 생성자호출을 해서 Null의 값을 0으로 바꿔주는 것.

			students[i].grade = i+1;
			Student ce = new Student();
		}
		
		System.out.println(students[2].grade);
	
	}


}


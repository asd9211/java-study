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


			students[i] = new Student();
			students[i].grade = i+1;
			Student ce = new Student();
		}
		
		System.out.println(students[2].grade);
	
	}


}


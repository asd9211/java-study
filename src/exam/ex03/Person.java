package exam.ex03;

public class Person {
	public String name;
	public int age;

	public static void main(String[] args) {
		Person[] p = new Person[3];
		for (int i = 0; i < p.length; i++) {
			
			p[i] = new Person(); // Person[0],[1],[2]에는 null이 들어가 있기 떄문에, 메모릴만들어줘라.
			p[i].name = "이름" + 1;
			p[i].age =  1+i;

			
			System.out.println(p[i].age);
			
		}
	}
}

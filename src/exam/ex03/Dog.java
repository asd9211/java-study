package exam.ex03;

public class Dog {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) { // 이런걸 get/set 메소드라고 부른다. 각각 메소드를 세터 메소드 , 게터 메소드 라고 부른다.
		this.age = age;

	}

	public int getAge() {
		return this.age;
	}

}

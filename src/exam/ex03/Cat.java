package exam.ex03;

public class Cat {
	public String name;
	public int age;
									//오버라이딩 : 재정의이다. 상속을 기준으로 메소드의 데이터타입, 파라메터가 같아야됨.
	public String toString() {
		return "이 고양이의 이름은" + name + "이구요, 나이는 " + age + "입니다";
		
	}
	public static void main(String[] args) {
		Cat[] c = new Cat[3];

		for (int i = 0; i < c.length; i++) {

			c[i] = new Cat();
			c[i].name = "이름" + (i + 1);
			c[i].age = 1 + i;

		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].name);

			System.out.println(c[i].age);
			System.out.println(c[i]);
		}

	}
}

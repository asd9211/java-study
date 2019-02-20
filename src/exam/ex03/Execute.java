package exam.ex03;

public class Execute {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[10];

		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();

			dogs[i].setName("멍머이" + (i + 1));
			dogs[i].setAge(i + 1);

		}
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].getName());
			System.out.println(dogs[i].getAge());

		}

//		Dog d = new Dog();
//		d.setAge(10);
//		System.out.println("d의 나이는" + d.getAge()); // 모든 멤버변수는 private로 선언하고 그 값을 가져오는것을 public get/set 메소드로 선언해서 외부에서 가져올 수 있게 한다. 이게 표준.

	}

}

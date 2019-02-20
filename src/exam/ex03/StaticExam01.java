package exam.ex03;

public class StaticExam01 {

	public static String name = "하하";
	public String name1 = "호호";

	public static void test() {
		System.out.println(StaticExam01.name);
	}

	public static void main(String[] args) {
		StaticExam01 se = new StaticExam01();
		se.name = "허허허허허";
		se.name1 = "허허허허허";
		se = new StaticExam01(); //static 으로 정의되어있는 것들은 아무리 new를 해봐야 다시 선언되지않는다.
		System.out.println(se.name); 
		System.out.println(se.name1); // static은 처음에 설정된이후로 초기화가 안된다. 그래서 값을 바꿔도 안변하는것.
		
	}
}

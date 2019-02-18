package exam.ex01;

public class Executer {
	public static void main(String[] args) {
		Object f = new Father();
		System.out.println(f.toString());

		Father f1 = new Father();
		Son s = new Son(); // Son s 라는 데이터타입에 Son이라는 메모리 생성 대입 
		Father f2 = new Father();
		f2 = new Son(); // Son이 Father를 확장받았기 때문에 가능한 거.
		
		Object obj = new Son();
		Father f3 = new Son();
		Son s1 = new Son();
		System.out.println(obj.toString());
		
		Object[] objs = new Object[3];  //오브젝트에서 파더를 대입할 수 있다. 개념상 상하관계로. 개념상 하위 클래스가 기능이 더 많아도 상위에 대입을 한다. 그리고 상위가 가지고 있지 않은 기능을 사용하려면 한번 치환해줘야한다.
		objs[0] = obj;
		objs[1] = f3; 
		objs[2] = s1;
				
		((Father)objs[1]).printInfo();
		
		// = Father f4 = (Father)objs[1];
		// f4.printInfo();
		
		f3.printInfo();
	}
}

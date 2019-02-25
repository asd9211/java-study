package collection.list;

import java.util.ArrayList;
import java.util.List;

class Person2{
	private String name;
	public void setName(String name) {
		this.name = name;
	
	}
	public String getName() {
		return this.name;
	}
}
public class PersonList2 {

	public static void main(String[] args) {
		Person2 p = new Person2();
		Person2 p2 = p;
		
		p2 = new Person2();
		p2.setName("hong");
		
		System.out.println(p.getName());
		System.out.println(p2.getName()); // 참조하는 주소가 같아져서 black이 나옴
		
		
		Person2 b = new Person2();  //여기에서 생성하면 밑에 for에서의 값이 홍길동 9만 반복할 수 밖에없다. 왜? 같은 메모리를 바라보고 있기때문에, 새로 생성을 안하고.
		List<Person2> pList = new ArrayList<>();
		for(int i =0; i<10; i++) {
			
			p.setName("홍길동" + i); // 같은 메모리안에서 홍길동 1 = 2 = 3 =4 =5 되면서 마지막엔 같은 값만.
			pList.add(b); // pList에 넣으면 for문이 끝나도 살아있다.
		}
		for(int i =0; i<10;i++) {
			Person2 b2 = pList.get(i);
			System.out.println(p2.getName());
		}
	}
}

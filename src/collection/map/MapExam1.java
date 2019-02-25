package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam1 {

	public static void main(String[] args) {
		//맵은 순서대로 들어가지 않는다. 이는 즉, 인덱스가 없다는 것을 뜻한다. 왜 y? 맵은 key- value 구조다. 리스트는 인덱스 구조고.
		// ex) 몇번째 줄에서 몇번째 있는 분 나오세요. ( 인덱스 구조 ), 그냥 바로 누구(key) 나오세요 ( 키 밸류 구조 )
		HashMap<String,String> hm = new HashMap<>(); // list는 구성원의 데이터타입만 정의해주면된다. 맵은 내가 해주는거니깐 다 정의해줘야된다. 키와 밸류!
		hm.put("이름","홍길동"); // 인덱스는 add지만 맵에서는 put이다. 키와 밸류의 값을 같이 넣어줘야 한다.
		
		hm.put("이름","홍길동2"); // 맵은 같은 키값으로 중복으로 선언을 하면, 제일 마지막의 밸류값만이 출력이 된다.
		System.out.println(hm.get("이름")); // 이러면 홍길동2라는 값이 출력됨. 리스트처럼 get까진 똑같은데 방순서가 아닌 키값을 입력해줘야함
		
		
		hm.put("이1름", "길덩이");
		hm.put("이2름", "길덩이");
		hm.put("이3름", "길덩이");
		hm.put("이4름", "길덩이");
		hm.put("이5름", "길덩이");
		hm.put("이6름", "길덩이"); //맵은 집어넣고 출력할 때 코드 순서대로 출력되진 않는다.
		
		System.out.println(hm);
		
		
		HashMap<Integer,String> hg = new HashMap<>();
		hg.put(1,"홍길동"); // 정의할 때의 데이터타입과 값의 데이터타입이 같아야 한다. Integer = 1
		
		List<String> ll = new ArrayList<>(); // 리스트 <>안에 정해진 데이터타입은 입력불가. 
	
		
		
		List<HashMap<String,String>> al = new ArrayList<>(); // 이것도 된다. 왜와이..
		
		
	}
}

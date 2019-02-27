package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam3 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "가만두지 않겠다.");
		map.put(2, "마지막이다.");
		map.put(3, "음...");
		
		System.out.println(map);
		
		HashMap<String,Object> cat = new HashMap<>();
		
		cat.put("name", "냥이1"); // 장점 : 플렉시블(유연)하다. 단점 : 찾기가 힘들다.
		cat.put("age", 11);
		System.out.println(cat);
		List<HashMap<String,Object>> catList = new ArrayList<>();
		for(int i = 0 ; i <10 ; i++) {
			HashMap<String,Object> c = new HashMap<>(); 
			int ranNum = (int)(Math.random()*30+1);

		
			c.put("name","냥이"+(i+1));
			c.put("age",ranNum);
			
			catList.add(c);
		}
		// System.out.println(catList); 가로 출력
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(catList.get(i));

			HashMap<String,Object> c = new HashMap<>();
			c.put("name", "냥이!!!");
			c = new HashMap<>();
			System.out.println(catList.get(i)); // 1,2,3,4,5,6,7,8,9,10이 나온다. y? 바로위에서 c를 다른 곳을 바라보게하고, 다시 원래의 값을 물어봤기 때문에.
			
			
		}
	}
}

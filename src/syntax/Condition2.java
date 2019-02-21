package syntax;

public class Condition2 {
	
	static String getStr() {
		return "ABC"
		;
	}
	
	public static void main(String[] args) {
		int a = 4;
//		String str ="a는 3이 아니다.";
//		
//		if(a==3) {
//			str = "a는 3이다.";
//		}
		String str = (a==3)?"a는 3이다.":"a는 3이 아니다.";
		System.out.println(str);
		
		String s1 = "Dog";
		System.out.println(s1.toLowerCase().equals("dog")); // s1을 소문자로 바꾸고 dog랑 비교하는 것
		System.out.println(s1.equalsIgnoreCase("dog")); // 값의 대소문자를 무시하는것
		
		String str1 = getStr();
		System.out.println(str1); // 대문자 ABC가 찍힌다.
		System.out.println(getStr().toLowerCase()); // 어차피 str도 겟str이니깐 여기선 투로어케이스하니깐 소문자로 리턴한다. 값자체를 바꾸는 것은 아니다
		System.out.println(str1);
		str1 = str1.toLowerCase();
		System.out.println(str1.toLowerCase().contentEquals("abc"));
	}
}

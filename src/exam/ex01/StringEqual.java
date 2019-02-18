package exam.ex01;

public class StringEqual {
	public static void main(String[] args) {
		
		String s1 = new String ("a");
		String s2 = new String ("a");
		String s3 = new String ("a");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		
		String str1 = "abcd";
		String str2 = new String("abcd");
		System.out.println(str1.equals(str2));
		System.out.println(str1=="abcd"); // == 주소값을 비교해라. abcd의 주소와 new String abcd는 다르다. 왜? 새로 만들으라는 명령어가 앞에 붙었으니. 
		System.out.println(str2=="abcd");
	}
}

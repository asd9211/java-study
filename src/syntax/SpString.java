package syntax;

public class SpString {
	public static void main(String[] args) {
		String str = "\"\""; // 쌍따옴표를 찍고싶다면 역슬러시를 앞에 넣어주면된다.
		String a = "\"\ta"; //쌍따옴표 중간에 t가 탭 tab이 들어간것.
		String b = "\"\ta\nb"; // t가 탭, n이 엔터
		
		System.out.println(str);
	}
}

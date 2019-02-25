package collection.list;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
	private String[] values;

	public CustomList() {
		values = new String[0];
	}

	public void add(String value) {
		String[] tmp = values;
		values = new String[values.length + 1]; // 방하나 더 만드는 작업.
		for (int i = 0; i < tmp.length; i++) {
			values[i] = tmp[i];
		}
		values[values.length - 1] = value;
	}

	public int size() {
		return this.values.length;

	}

	public String toString() {
		String r = "[";
		for (String str : values) {
			r += str + ",";
		}
		r = r.substring(0, r.length() - 1); // 다합치고 마지막 자리수만 자르는 거라 ,를 제거해준다.
		r += "]";
		return r;
	}

	public static void main(String[] args) {
		CustomList cl = new CustomList();

		System.out.println(cl.size());
		cl.add("str");
		System.out.println(cl.size());

	}
}

package oop.generic;

import java.util.HashMap;

public class KeyValueGeneric<K,V> extends HashMap<K,V> {
	public static void main(String[] args) {
		KeyValueGeneric<String,String> kvg = new KeyValueGeneric<>();
		kvg.put("name","길덩이");
		String name = kvg.get("name");
		
	}

}

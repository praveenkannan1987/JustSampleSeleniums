package day13and14;

import java.util.Map;
import java.util.LinkedHashMap;

public class Classex1 {

	public static void main(String[] args) {
		// "paypal india" print the number of occurance
		String cn="paypal india";
		char ch[]=cn.toCharArray();
		Map<Character, Integer> map=new LinkedHashMap<>();
		for (char c : ch) {
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else
				map.put(c, 1);
		}
		System.out.println(map);
	}

}

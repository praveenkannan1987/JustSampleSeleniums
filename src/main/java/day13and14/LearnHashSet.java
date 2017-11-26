package day13and14;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnHashSet {

	public static void main(String[] args) {
		String cn="Hexaware";
		char ch[]=cn.toCharArray();
		Set<Character> map=new LinkedHashSet<Character>();
		for (char c : ch) {
			map.add(c);
		}
		System.out.println(map);
	}

}

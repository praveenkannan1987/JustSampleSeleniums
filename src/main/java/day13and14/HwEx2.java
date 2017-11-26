package day13and14;

import java.util.LinkedHashMap;
import java.util.Map;

public class HwEx2 {

	public static void main(String[] args) {
		String cn="Aspire System";
		int max=0;
		char max1=' ',max2=' ';
		
		char ch[]=cn.toUpperCase().toCharArray();
		Map<Character, Integer> map=new LinkedHashMap<>();
		for (char c : ch) {
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else
				map.put(c, 1);
		}
		for(Map.Entry<Character, Integer> itr:map.entrySet()){
			if(itr.getValue()>max){
				max=itr.getValue();
				max1=itr.getKey();
			}
		}
		System.out.println("Most repeated:"+max1+" Count:"+max);
		max=0;
		for(Map.Entry<Character, Integer> itr:map.entrySet()){
			if(itr.getValue()>max && itr.getKey()!=max1){
				max=itr.getValue();
				max2=itr.getKey();
			}
		}
		System.out.println("Most repeated:"+max2+" Count:"+max);
		
	}

}

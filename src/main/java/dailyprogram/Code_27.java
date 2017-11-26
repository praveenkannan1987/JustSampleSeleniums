package dailyprogram;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class Code_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(21, "Twenty one");
		map.put(41, "forty one");
		map.put(35, "Thirty five");
		map.put(61, "sixty one");	
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(map);
		//System.out.println(treeMap);
		//map = (HashMap<Integer, String>) treeMap;
		for (Entry<Integer, String> s : treeMap.entrySet()) {
			System.out.println(s.getKey()+" :"+s.getValue());
		} 
	}

}

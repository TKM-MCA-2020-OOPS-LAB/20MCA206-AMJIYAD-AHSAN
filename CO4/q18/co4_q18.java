import java.util.*;
public class co4_q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> h_map = new HashMap<>();
	      h_map.put("1","Abhilash");
	      h_map.put("2","Abhishek");
	      h_map.put("3","Agna");
	      
	      //hash map
	      System.out.println("\nHashMap:"+h_map);
	      Map<String, String> treeMap = new TreeMap<>();
	      treeMap.putAll(h_map);
	      
	      //tree map
	      System.out.println("\nTreeMap:"+treeMap);
	}

	}


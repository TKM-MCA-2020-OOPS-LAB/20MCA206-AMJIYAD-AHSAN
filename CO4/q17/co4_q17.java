import java.util.*;
public class co4_q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm = new HashMap<>();
		  
        // Inserting the Elements
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(4, "Four");
        hm.put(5, "Five");
  
        System.out.println("Initial Map: "+hm);
        
        hm.put(2, "Six"); //Changing an element
        
        System.out.println("Updated Map: " +hm);
        
        hm.remove(4); //Removing an element
        
        System.out.println("Final Map: "+hm);

	}

	}



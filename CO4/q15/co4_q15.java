import java.util.*;
import java.util.LinkedHashSet;
public class co4_q15 {

	public static void main(String[] args) {
		 LinkedHashSet<String> linkedset = new LinkedHashSet<String>(); 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the no of items you need to enter");
		 int n=sc.nextInt();
		 System.out.println("Enter the items");
		 for(int i=0;i<n;i++)
		 {
			 String s=sc.next();
			 linkedset.add(s);// Elements are added using add() method
		 }
		 System.out.println("Size of LinkedHashSet = " +linkedset.size());  
         System.out.println("Original LinkedHashSet:" + linkedset);  
         System.out.println("Removing D from LinkedHashSet: " +linkedset.remove("D"));  
         System.out.println("Trying to Remove Z which is not "+"present: " + linkedset.remove("Z"));  
         System.out.println("Checking if A is present=" + linkedset.contains("A"));
         System.out.println("Updated LinkedHashSet: " + linkedset); 
         
         // Iterating Using enhanced for loop
         System.out.println("After iterating");
         for (String s : linkedset)
             System.out.print(s + ", ");
         System.out.println();
		 

	}

}

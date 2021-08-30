import java.util.*;
public class co4_q16 {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of elements in first set: ");
		int n=sc.nextInt();
		System.out.println("\nEnter elements of first set: ");
		for(int i =0;i<n;i++)
		{
			String s=sc.next();
			set1.add(s);
	 
		}
		
		System.out.println("\nEnter Number Of elements in second set: ");
		int j=sc.nextInt();
		System.out.println("\nEnter Elements of second set: ");
		for(int i =0;i<j;i++)
		{
			String s=sc.next();
			set2.add(s);
	 
		}
		System.out.println("\nHash Set 1: " + set1);
		System.out.println("\nHash Set 2: " + set2);
		
		//set union
		System.out.print("\nUnion of the two Sets\n");
		Set<String> union = new HashSet<String>(set1);
	    union.addAll(set2);
	    System.out.println(union);
	        
	    //set intersection
	    System.out.print("\nIntersection of the two Sets\n");
	    Set<String> intersection = new HashSet<String>(set1);
	    intersection.retainAll(set2);
	    System.out.println(intersection);
	        
	    //set difference
	    System.out.print("\nDifference of set1 from set2\n");
	    Set<String> difference = new HashSet<String>(set1);
	    difference.removeAll(set2);
	    System.out.println(difference);	
		

	}

}

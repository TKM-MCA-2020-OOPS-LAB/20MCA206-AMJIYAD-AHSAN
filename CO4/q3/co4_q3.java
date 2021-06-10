import java.util.*;
class U_Exception extends Exception {
	public U_Exception(String string) {
		super(string);
	}
}

class P_Exception extends Exception {
	public P_Exception(String string) {
		super(string);
	}
}
public class co4_q3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    String uname, pass;
		  
		  System.out.print("Enter username:");
		  uname = sc.nextLine();
		  
		  System.out.print("Enter password:");
		  pass = sc.nextLine();
		  
		  int length = uname.length();
		 
		  try {
			 if(length<=4)
				 throw new U_Exception("username must be above  4 characters!");
			 if(!pass.equals("Amj@20"))
		    	 throw new P_Exception("Incorrect password\nEnter the correct password");
		     else
		    	 System.out.println("login success");
		      }
		  
		  catch (U_Exception U) 
		    {
			  U.printStackTrace();
		    }
		  catch (P_Exception P)
		    {
		      P.printStackTrace();
		    }
		  finally 
		    {
			  System.out.println("The finally block executed ");
			  
		    }

	}

}

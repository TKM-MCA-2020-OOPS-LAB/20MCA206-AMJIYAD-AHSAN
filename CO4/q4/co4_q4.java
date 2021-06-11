import java.util.*;
class neg_exception extends Exception
{
	neg_exception()
	{
		super("negative number not allowed!! \n");
	}
}
public class co4_q4 {

	public static void main(String[] args) {
		int n,r,sum=0;
		double avg;
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			try
			{
				System.out.println("Enter the number:");
				r=sc.nextInt();
				
				if(r<0)
				{
					i--;
					throw new neg_exception();
				}
				else
				{
					sum=sum+r;
				}
				
			}
			catch(neg_exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Average="+(sum/n));
		
	}

}

import java.util.*;
class mul_thread extends Thread
{
	public void run()
	{
		System.out.println("Executing mul thread:\n");
		for(int i=1;i<=12;i++)
		{
			System.out.println("5*"+i+ "="+i*5);
		}
	}
}
class prime_thread extends Thread
{ 

	public void run()
	{
		System.out.println("Executing prime thread:\n");
		int n,flag,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		n=sc.nextInt();

	    for (i = 1; i <= n; i++)
	    {
	 
	        if (i == 1 || i == 0)
	            continue;
	 
	        flag = 1;
	 
	        for (j = 2; j <= i / 2; ++j)
	        {
	            if (i % j == 0)
	            {
	                flag = 0;
	                break;
	            }
	        }
	 
	        if (flag == 1)
	            System.out.print(i + " ");
	    }
		
	}
}
public class co4_q5 {

	public static void main(String[] args) throws InterruptedException{
		mul_thread m=new mul_thread();
		m.start();
		m.sleep(1000);
		
		
		prime_thread p=new prime_thread();
		p.start();
	    p.sleep(1000);
		

		
		
		
		
		
		
		

	}

}

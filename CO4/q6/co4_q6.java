import java.util.Scanner;

class Fibo implements Runnable{
	public void run(){
		int a=0,b=1,c,i,n;
		c=a+b;
		System.out.print("enter the limit:");
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		System.out.println("Fibonacci series:");
		System.out.print(a+" "+b+" ");
		
		
		for(i=3;i<=n;i++)
        {
			System.out.print(c+" ");
			
			a=b;
			b=c;
			c=a+b;
        }
		
		}
}

class EvenT implements Runnable
{
	public void run()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		n=sc.nextInt();
		System.out.println("Even numbers are:");
		for(int i=1;i<=n;i++) 
		{
			if(i%2==0) 
			{
				System.out.print(" "+i);
			}
			}
		}
}
public class gee {

	public static void main(String[] args) {
		Fibo f=new Fibo();
		Thread t1=new Thread(f);
		t1.start();
		
		
		EvenT e=new EvenT();
		Thread t2=new Thread(e);
		t2.start();
	}

}
import java.util.Scanner;
public class complex {
	int a;
	int b;
	public void display()
	{
		System.out.println("\n complex no is:"+a +"+"+"i"+b);
			
	}
	public void displaysum(int realsum,int imagsum)
	{
		System.out.println("\n sum of 2 complex numbers is:"+realsum+"+"+"i"+imagsum);
	}

	public static void main(String[] args) {
		int realsum;
		int imagsum;
		complex obj1=new complex();
		System.out.println("Enter the real and imaginary part of 1st complex no:");
		Scanner d =new Scanner(System.in);
		obj1.a=d.nextInt();
		obj1.b=d.nextInt();
		obj1.display();
		complex obj2=new complex();
		Scanner c =new Scanner(System.in);
		System.out.println("Enter the real and imaginary part of 2nd complex no:");
		obj2.a=c.nextInt();
		obj2.b=c.nextInt();
		obj2.display();
		
		realsum=obj1.a+obj2.a;
		imagsum=obj1.b+obj2.b;
		
		
		
		obj1.displaysum(realsum,imagsum);
		
		
		
		
		

	}

}

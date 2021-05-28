import java.util.*;
interface calc
{
	public void area();
	public void perimeter();
	Scanner sc=new Scanner(System.in);
	
}
class circle implements calc
{
	int r;
	double pi=3.14;
	
	public circle()
	{
		System.out.println("Enter the radius");
		r=sc.nextInt();
	}
	public void area()
	{
	     System.out.println("Area of circle is :"+(pi*r*r));
	}
	public void perimeter()
	{
		  System.out.println("perimeter of circle is :"+(2*pi*r));
	}
}
class rectangle implements calc
{
	int l,b;
	public rectangle()
	{
		System.out.println("Enter length and breath of Rectangle");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	public void area()
	{
		System.out.println("Area of Rectangle is "+(l*b));
	}
	public void perimeter()
	{
		System.out.println("Perimeter of Rectangle is "+2*(l+b));
	}
}
public class co3_q6 {

	public static void main(String[] args) {
		int ch,opt;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Find \n1.Cirlce \n2.Rectangle");
		ch=sc1.nextInt();
		switch(ch)
		{
		case 1: circle c = new circle();
				System.out.println("Enter your choice");
		        System.out.println("1.Area \n2.perimeter");
		        opt=sc1.nextInt();
		        if(opt==1)
		        {
		        	c.area();
		        }
		        else
		        {
		        	c.perimeter();
		        }
		        break;
		case 2: rectangle r=new rectangle();
		        System.out.println("Enter your choice");
                System.out.println("1.Area \n2.perimeter");
                opt=sc1.nextInt();
                if(opt==1)
                {
                	r.area();
                }
                else
                {
                	r.perimeter();
                }
		        
		         
				
		}

	}

}

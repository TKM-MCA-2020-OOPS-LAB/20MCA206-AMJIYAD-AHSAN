import java.util.*;
class employee1
{
	int empid;
	String name;
	double salary;
	String address;
	
public  employee1()
{
	System.out.println("enter employee id :");
	Scanner sc=new Scanner(System.in);
	empid=sc.nextInt();
	
	System.out.println("enter employee name :");
	name=sc.next();
	
	System.out.println("enter employee salary :");
	salary=sc.nextDouble();
	
	System.out.println("enter employee address :");
	address=sc.next();
		
}
}
class teacher extends employee1
{
	String dept;
	String subject;
	
	public  teacher()
	{
		System.out.println("enter departnemt name :");
		Scanner sc1=new Scanner(System.in);
		dept=sc1.next();
		
		System.out.println("enter teaching subject :");
		subject=sc1.next();
		
	}
	void display()
	{
		System.out.println("employee id :"+empid);
		System.out.println("employee name :"+name);
		System.out.println("employee salary :"+salary);
		System.out.println("employee address :"+address);
		System.out.println("department name :"+dept);
		System.out.println("teaching subject :"+subject);
	}
}


public class co3_q2 {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the number of teachers  :");
		Scanner sc2=new Scanner(System.in);
	    n=sc2.nextInt();
	    teacher e[]=new teacher[n];
		for(int i=0;i<n;i++)
		{
			e[i]=new teacher();
			
		}
		for(int i=0;i<n;i++)
		{
			e[i].display();
		}
		

	}

}

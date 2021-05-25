import java.util.*;
class publisher
{
	String pub;
	Scanner sc=new Scanner(System.in);
	public publisher()
	{
		
		System.out.println("Enter publisher name:");
		pub=sc.next();
	}
}
class book extends publisher
{
	String bkname;
	String Author;
	public book()
	{
		System.out.println("Enter book name:");
		bkname=sc.next();
		
		System.out.println("Enter Author name:");
		Author=sc.next();
		
		
	}
}
class literature extends book
{
	public literature()
	{
		System.out.println("category:literature");
		System.out.println(".........................................");
	}
	void display()
	{
		System.out.println("publishername:"+pub);
		System.out.println("book name:"+bkname);
		System.out.println("Author name:"+Author);
	}
}
class fiction extends book
{
	public fiction()
	{
		System.out.println("category:fiction");
		System.out.println("........................................");
		System.out.println("\n");
	}
	void display()
	{
		System.out.println("publishername:"+pub);
		System.out.println("book name:"+bkname);
		System.out.println("Author name:"+Author);
	}
}
public class co3_q4 {

	public static void main(String[] args) {
		int ch;
		int i;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the no of literature books you need to store:");
		int n=sc1.nextInt();
		literature l[]=new literature[n];
		for( i=0;i<n;i++)
		{
			l[i]=new literature();
			
		}
		System.out.println("Enter the no of fictional books you need to store:");
		int m;
		m=sc1.nextInt();
		fiction f[]=new fiction[m];
		for( i=0;i<m;i++)
		{
			f[i]=new fiction();
			
		}
		
		System.out.println("To display literature books,press 1");
		System.out.println("To display fictional books,press 2");
		ch=sc1.nextInt();
		if(ch==1)
		{
			for(i=0;i<n;i++)
			{
				System.out.println("Displaying details of book no"+(i+1));
				l[i].display();
			}
		}
		else if(ch==2)
		{
			for(i=0;i<m;i++)
			{
				System.out.println("Displaying details of book no:"+(i+1));
				f[i].display();
			}
		}
		else
		{
			System.out.println("please enter a valid choice");
		}
		
		
		
		

	}

}

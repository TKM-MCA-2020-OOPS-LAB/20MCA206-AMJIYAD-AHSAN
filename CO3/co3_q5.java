class student
{
	int rno;
	String name;
	int mat,phy,com;
	
	public student()
	{
		this.rno=1;
		this.name="john";
		this.mat=90;
		this.phy=70;
		this.com=100;
	}
}
class sports extends student
{
	int sports_gr;
	
	public sports()
	{
		this.sports_gr=50;
	}
	
	
}
class Result extends sports
{
	void display()
	{
		System.out.println("Displaying Academic details");
		System.out.println(".............................");
		System.out.println("Roll no :"+rno);
		System.out.println("Name :"+name);
		System.out.println("Maths Score :"+mat);
		System.out.println("Physics Score :"+phy);
		System.out.println("Computer Score :"+com);
		System.out.println("\n");
		System.out.println("Displaying Sports Details");
		System.out.println(".............................");
		System.out.println("Sports Grade :"+sports_gr);
		
	}
}
public class co3_q5 {

	public static void main(String[] args) {
		Result r=new Result();
		r.display();

	}

}

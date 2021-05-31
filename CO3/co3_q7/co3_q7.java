import java.util.*;
interface bill
{
	void calculate();
}
class total implements bill
{
	public void calculate()
	{
		System.out.println("Order No.");
		System.out.println("\n");
		System.out.println("Date:"+java.time.LocalDate.now());
		System.out.println("\n");
		System.out.println("Product Id\tName\tQuantity\tunit price\t\tTotal");
		System.out.println("_________________________________________________________________________");
		System.out.println(+101+"\t\t"+"A"+"\t\t"+2+"\t\t"+25+"\t\t"+50);
		System.out.println(+102+"\t\t"+"B"+"\t\t"+1+"\t\t"+50+"\t\t"+100);
		System.out.println("_________________________________________________________________________");
		System.out.println("\t\t\t\t\t Net.Amount\t\t"+150);
		
		
		
		
	}
}

public class co3_q7 {

	public static void main(String[] args) {
		total t=new total();
		t.calculate();
		
	

	}

}

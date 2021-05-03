
public class cpu {
	
	int price;
	
	public class processor
	{
		int no_cores;
		String manufacturer;
		
		
	}
	static class RAM
	{
		 int memory;
		 String manufacturer;
		 
	}
	public void display(int a,int b,int c,String s, String d)
	{
		System.out.println("\n processor Details");
		System.out.println("\n price: "+a+"\n"+"number of cores: "+b+"\n"+"Manufacturer: "+s);
		System.out.println("\n RAM details");
		System.out.println(" \n memory: "+c+"\n"+"manufacturer: "+d);
	}

	public static void main(String[] args) {
		int a,b,c;
		String s,d;
		
		cpu obj=new cpu();
		cpu.processor obj1=obj.new processor();
		
		a=obj.price=30000;
		b=obj1.no_cores=8;
		s=obj1.manufacturer="intel";
		
		cpu.RAM obj2=new RAM();//accessing 
		c=obj2.memory=8;
		d=obj2.manufacturer="Asus";
		
		
		obj.display(a,b,c,s,d);
		
		
		
		
		

	}

}

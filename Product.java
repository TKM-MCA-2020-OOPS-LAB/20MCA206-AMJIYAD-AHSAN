
public class Product {
	int pcode;
	String pname;
	int price;
	void data(int c,String n,int p)
	{
		pcode=c;
		pname=n;
		price=p;
	}
	void display() {
		System.out.println(pcode+"\t"+pname+"\t"+price);
	}
	static void lowest(double price1,double price2,double price3)
	{
		if(price1<=price2 && price1<=price3)
			System.out.println("NOKIA has the lowest price");
		else if(price2<=price1 && price2<=price3)
			System.out.println("SAMSUNG has the lowest price");
		else
			System.out.println("IPHONE has the lowest price");
	}

	public static void main(String[] args) {
       Product obj1= new Product();
       Product obj2= new Product();
       Product obj3= new Product();
       obj1.data(101,"NOKIA",2000);
       obj2.data(201,"SAMSUNG",3000);
       obj3.data(301,"IPHONE",5000);
       System.out.println("product information:");
       obj1.display();
       obj2.display();
       obj3.display();
       lowest(obj1.price,obj2.price,obj3.price);

	}

}

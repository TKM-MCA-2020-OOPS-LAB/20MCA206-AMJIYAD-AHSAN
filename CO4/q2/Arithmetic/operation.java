package Arithmetic;

interface basic
{
	void add(double a,double b);
	void sub(double a,double b);
	void mul(double a,double b);
	void div(double a,double b);
}

public class operation implements basic {
	public void add(double a,double b)
	{
		System.out.println("addition :"+(a+b));
	}
	public void sub(double a,double b)
	{
		System.out.println("subtraction:"+(a-b));
	}
	public void mul(double a,double b)
	{
		System.out.println("multiplication:"+(a*b));
	}
	public void div(double a,double b)
	{
		System.out.println("division:"+(a/b));
	}
}

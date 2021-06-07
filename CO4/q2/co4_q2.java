package Arithmetic;

import Arithmetic.operation;
import java.util.*;

public class co4_q2 {

	public static void main(String[] args) {
		double a,b;
		operation o=new operation();
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		o.add(a,b);
		o.sub(a,b);
		o.mul(a,b);
		o.div(a,b);
		
		

	}

}

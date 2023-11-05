package Package_polymorphism;

public class static_polymorphism 
{

	public static void main(String[] args) 
	{
		Arithmetic obj =new Arithmetic();
		double c=Arithmetic.multiplication(10.3, 9.1);
		int d=Arithmetic.multiplication(7, 3);
		System.out.println("Multiplication of int values:"+d);
		System.out.println("Multiplication of double values:"+c);
	}

}

class Arithmetic
{
	static int multiplication(int a ,int b)
	{
		return a*b;
	}
	
	static double multiplication(double a,double b)
	{
		return a*b;
	}
}

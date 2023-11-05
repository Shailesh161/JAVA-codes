package heirarchical_inheritance;

public class heirarchical_inheritance 
{

	public static void main(String[] args) 
	{
		A obj =new A();
		B b =new B();
		C c =new C();
		D d =new D();
		System.out.println("Using object of class A");
		obj.print_method_A();
		System.out.println("Using object of class B");
		b.print_method_A();
		b.print_method_B();
		System.out.println("Using object of class C");
		c.print_method_C();
		c.print_method_A();
		System.out.println("Using object of class D");
		d.print_method_A();
		d.print_method_D();
		//c.print_method_B();//not accessible
		
		
	}

}

class A
{
	public void print_method_A()
	{
		System.out.println("Inside class A");
	}
}

class B extends A
{
	public void print_method_B()
	{
		System.out.println("Inside class B");
	}
}

class C extends A
{
	public void print_method_C()
	{
		System.out.println("Inside class c");
	}
}

class D extends A
{
	public void print_method_D()
	{
		System.out.println("Inside Class D");
	}
}
package Package_polymorphism;

public class dynamic_polymorphism 
{

	public static void main(String[] args) 
	{
		parent p ;
		
		p=new parent();
		p.print();
;
		p=new child();
		p.print();
		
		p=new grandchild();
		p.print();
	}

}


class parent
{
	public void print()
	{
		System.out.println("This is parent class:");
	}
	
}

class child extends parent
{
	public void print()
	{
		System.out.println("This is child class:");
	}
}

class grandchild extends parent
{
	public void print()
	{
		System.out.println("This is grandchild class:");
	}
}
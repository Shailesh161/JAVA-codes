package Multilevel_Inheritance;

public class multilevel_inheritance 
{
	public static void main(String args[])
	{
		Model obj=new Model();
		obj.Company_name();
		obj.carname();
		obj.Modelname();
	}
}

class Company
{
	public void Company_name()
	{
		System.out.println("The name of Company is : MARUTI SUZUKI");
	}
}


class Car extends Company
{
	public void carname()
	{
		System.out.println("The name of Car is : Swift");
	}
}

class Model extends Car
{
	public void Modelname()
	{
		System.out.println("Model of Car is : Petrol");
	}
}
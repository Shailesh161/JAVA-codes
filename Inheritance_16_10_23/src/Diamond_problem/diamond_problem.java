package diamond_probelm;

class A 
{
    void display() 
    {
        System.out.println("Class A");
    }
}

class B extends A 
{
	
}

class C extends A 
{
	
}

class D extends B,C //Diamond Problem occured ,hence error
{

}

public class diamond_problem
{
    public static void main(String[] args) 
    {
        D d = new D();
        d.display(); // Which class should this call?
    }
}

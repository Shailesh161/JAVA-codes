package Single_Inheritance;

public class single_inheritance 
{
	public static void main(String args[])
	{
		Artist obj =new Artist();
		System.out.println("The Marks of Student are :"+obj.marks+" marks");
		System.out.println("The benefits are:"+obj.benefits+" marks");
	}
}

class Student
{
	public Integer marks=92;
}

class Artist extends Student
{
	Integer benefits=2;
}

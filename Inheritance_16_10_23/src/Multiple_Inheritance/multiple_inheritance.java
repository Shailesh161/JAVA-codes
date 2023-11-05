package Multiple_Inheritance;;

interface Polygon 
{
  void getArea(int length, int breadth);
}

// implement the Polygon interface
class Rectangle implements Polygon 
{

  // implementation of abstract method
  public void getArea(int length, int breadth) 
  {
    System.out.println("The area of the rectangle is " + (length * breadth));
  }
}

class multiple_inheritance
{
  public static void main(String[] args) 
  {
    Rectangle r1 = new Rectangle();
    r1.getArea(5, 6);
  }
}
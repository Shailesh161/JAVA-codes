import java.util.Scanner;


class countoccurences
{
  public static void main(String[] args) 
  {
    System.out.println("Enter a numbr;");
    Scanner input =new Scanner(System.in);
  int arr[]={8,9,5,6,4,8,5,4,9,9,9,5,8,6,6,4,2,5,2,4,8};
  int a =input.nextInt();
    int count =0;
  for(int i=0;i<arr.length;i++)
  {
    if(arr[i]==a)
    {
        count++;
    }
  }
System.out.println("Occured :"+count);
  input.close();
  }  
}
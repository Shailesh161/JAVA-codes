import java.util.Scanner;
public class greater
{ 

    int arr[]=new int[9];
    public static void main(String[] args) 
    {
        Scanner input =new Scanner (System.in);
        System.out.println("How many array elemnts to insert:");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++)
        {
             arr[i] =input.nextInt();
        }
        int count=0;
        System.out.println("Enter a number whose greater numbers is to be found:");
        int x=input.nextInt();
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>x)
            {
                count++;
            }
        }
        System.out.println("Numbers greater than"+x+"="+count);
        input.close();
    }
        
        
}    


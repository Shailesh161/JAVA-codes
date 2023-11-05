import java.util.Scanner;
public class countdigits 
{
    public static void main(String[] args) {
        System.out.println("program for counting number of digits in array:");
        Scanner input =new Scanner (System.in);
        System.out.println("Enter the number-");
        int num=input.nextInt();
    
        int count=0;
        
        while(num>0)
        {
           num= num/10;
            count++;
        }
        
        System.out.println("Count is :"+count);
        input.close();
    }   
}

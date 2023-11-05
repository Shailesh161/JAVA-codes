import java.util.Scanner;
public class voting 
{
    public static void main(String[] args) {
        System.out.println("voting eligiblity detector:");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age:");
        int Age=input.nextInt();
        System.out.println("YOU ENTERED:"+Age);
        if(Age>18)
        {
            System.out.println("Eligible for voting.");
        }
        else
        {
        System.out.println("not eligible.");
        }
        input.close();

    }    
}

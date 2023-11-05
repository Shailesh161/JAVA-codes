import java.util.Scanner;
public class input
{
    public static void main(String[] args) {
        System.out.println("taking input from user:");
        System.out.println("ENTER YOUR AGE:");
        Scanner input= new Scanner(System.in);
        int Age=input.nextInt();
        input.close();
        System.out.println("YOU ENTERED:"+Age);

    }    
}

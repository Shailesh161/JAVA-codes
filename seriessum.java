//here we have to take a number as a input from user e.g 5 . so now we have to find for first 5 digits 
//means if even number comes then we have to ada and if odd number comes then we have to subtract
//e.g  n=5  then first 5 digits will be 1 2 3 4 5 so in which 2 and 4 are even hence will be added and 1 3 5 will be subtrcted
//i.e -1+2-3+4-5

import java.util.Scanner;
public class seriessum {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner input =new Scanner (System.in);
        int num=input.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
            else
            {
                sum=sum-i;
            }
        }
        System.out.println("Sum is:"+sum);
        input.close();
    }
}

import java.util.Scanner;
public class sortedarrayornot 
{
    public boolean method()
    {
        System.out.println("Enter how many elemnets you want to add in array:");    
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
         int arr[]=new int[x];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Your entered array is :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]<arr[i])
            {
                 return '1';  
            }
            
            else{
                return '0';
            }
            
            
        }
    }
    public static void main(String[] args) 
    {
        
        

        input.close();

    }    
}

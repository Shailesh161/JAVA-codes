import java.util.Scanner;
public class searcharray 
{
    void searchinarray()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number which you waant to search in array :");
        int num=input.nextInt();
        int arr[]={8,5,9,6,7,4,2,16};

        int ans=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                ans=i;
            }
            
        }
        System.out.println("Present at index:"+ans);
        input.close();
    }


    public static void main(String[] args) 
    {
        searcharray obj =new searcharray();
        obj.searchinarray();
    }

}

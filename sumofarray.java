public class sumofarray 
{
    void sum()
    {
        int arr[]={1,5,3,10};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum is :"+sum);
    }

    public static void main(String[] args) 
    {
        sumofarray obj =new sumofarray();
        obj.sum();           
    }
    
}

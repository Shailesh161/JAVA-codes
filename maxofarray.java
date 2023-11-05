public class maxofarray 
{
    void max()
    {
        int arr[]={5,3,9,87};
        int maxnum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxnum)
            {
                maxnum=arr[i];
            }
        }
        System.out.println("The maximum number ammong all is :"+maxnum);

    }
    public static void main(String[] args) 
    {
        maxofarray obj =new maxofarray();
        obj.max();    
    }
}

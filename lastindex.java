public class lastindex 
{
    public int lastoccurence(int x)
    {
        int arr[]={ 5,7,9,9,5,5,5};
        int lastindex=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(x==arr[i])
            {
                lastindex=i;
            }
        }
        System.out.println("The last index is :"+lastindex);
        return lastindex;
        
    }
    
    public static void main(String[] args)
    {
          lastindex obj =new lastindex();
          obj.lastoccurence(5);
          

    }
}

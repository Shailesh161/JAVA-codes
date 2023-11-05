public class arraytraversal
{
    void method()
    {
        int arr[]=new int[5];
        arr[0]=12;
        arr[1]=16;
        arr[2]=19;
        arr[3]=21;
        arr[4]=14;
        
        for(int i=0;i<5;i++)
        {
            System.out.println("array elemnt at index ["+i+"] :"+arr[i]);
        }
    }

    public static void main(String[] args)
    {
        arraytraversal obj =new arraytraversal();
        obj.method();    
    }

}
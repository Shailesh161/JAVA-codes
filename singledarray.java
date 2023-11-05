class singledarray
{
    void singlearray()        //   method-1 to insert and access array
    {
        int arr[]=new int[3];           //it will take 
        arr[0]=5;
        arr[1]=7;
        arr[2]=8;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("Length of the array is :"+arr.length);
    }

    void arraysecondmethod()
    {
        int arr[]={4,8,12,16,20,44,56,44,28};
        for(int i=0;i<arr.length;i++)          //Remember use length not length();
        {
            System.out.println(arr[i]);
        }
        System.out.println("Length of the array is :"+arr.length);
    }


    public static void main(String[] args)
    {
        singledarray obj =new singledarray();
         obj.singlearray();                             //uncomment this for method1 i.e method 1 called here 
        //obj.arraysecondmethod();                       //uncomment this for method2 i.e method 2 called here
    }
}
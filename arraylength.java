import java.util.*;
public class arraylength 
{
    void singledimarrlen()
    {
        int arr[]={8,9,4,5,3,0};
        System.out.println("length of array is :"+arr.length);
    }
    
    void multidimarrlen()
    {
        int arr[][]=new int[4][3];
        System.out.println("length of multi dimension array is :"+arr.length);
    }

    public static void main(String[] args)
    {
        arraylength obj =new arraylength();
        obj.singledimarrlen();
        obj.multidimarrlen();   
    }
}

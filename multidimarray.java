public class multidimarray 
{
    void multidimensionmethod1()
    {
        int arr[][]=new int [2][2];             //3 rows and 4 columns
        arr[0][0]=7;                          //Remember arr[2][2]means two columns and two rows but as zero based 
        arr[0][1]=8;                        //indexing is there that's why (0,0),(0,1),(1,0),(1,1)
        arr[1][0]=13;                     //if arr[3][2] then (0,0),(0,1),(1,0),(1,1),(2,0),(2,1) i.e 3 rows 0th row,1st row,2nd row
        arr[1][1]=18;
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        
    }   

    void multidimmethod2()
    {
        int arr[][] ={{3,2},{4,6},{8,2,16},{9,5}};//here 4 brackets are there that means 4 rows which are row0,row1,row2,row3 and
        System.out.println(arr[0][0]);         //Each of the bracket has two values that means two columns are there
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]); // here in that 3rd bracket 3 values are there that means 3 columns which are (2,0),(2,1),(2,2)
        System.out.println(arr[3][0]);
        System.out.println(arr[3][1]);
    }
    
    
    public static void main (String args[])
    {
        multidimarray obj =new multidimarray();
       // obj.multidimensionmethod1();            //uncomment this for method 1 
       obj.multidimmethod2();                     //uncomment this for method 2
    }
}

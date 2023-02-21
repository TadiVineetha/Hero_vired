import java.util.*;
class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,8,4,10};
        int max=arr[0],index=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[1]>max)
            {
                max=arr[1];
                index=i;
            }
        }
        for(int ele:arr)
            System.out.println(ele);
    }
}
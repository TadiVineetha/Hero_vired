import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum[]=new int[n];
        for(int i=0; i<n; i++)
            a[i]=sc.nextInt();
        sum[0]=a[0];
        for(int i=1;i<n;i++)
            sum[i]=sum[i-1]+a[i];
        for(int ele:sum)
            System.out.print(ele+" ");
    }
}
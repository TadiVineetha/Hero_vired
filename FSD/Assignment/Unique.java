import java.util.*;
class Unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        HashSet<Integer>hs=new HashSet<Integer>();
        for(int ele:a)
        {
            hs.add(ele);
        }
        for(int e:hs)
        {
            System.out.print(e+" ");
        }
    }
}
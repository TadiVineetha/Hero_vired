import java.util.*;
class Missing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
            a[i]=sc.nextInt();
        ArrayList<Integer>num=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<n;i++)
            num.add(a[i]);
        for(int i=1;i<num.get(n-1);i++)
        {
            if(!num.contains(i))
                res.add(i);
        }
        for(int i=0;i<res.size();i++)
        System.out.print(res.get(i)+" ");
        
    }
}
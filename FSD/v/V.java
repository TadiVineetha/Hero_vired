// import java.util.*;
// class Recursion
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int res[]=new int[2];
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             a[i]=sc.nextInt();
//         }
//         int t=sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             if(a[i]==t)
//                 res[0]=i;
//             else
//                 res[0]=-1;
//         }
//         for(int i=n-1;i>=0;i--)
//         {
//             if(a[i]==t)
//                 res[1]=i;
//             else
//                 res[1]=-1;
//         }for(int ele:res)
//         {
//             System.out.print(ele+" ");
//         }
//     }
// }
// import java.util.*;
// class Recursion
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         for(int j=0;j<t;j++)
//         {
//             int cnt=0;
//             int n=sc.nextInt();
//             String b=Integer.toBinaryString(n);
//             for(int i=0;i<b.length();i++)
//             {
//                 if(b.charAt(i)=='1')
//                     cnt++;
//             }
//             System.out.println(cnt);
//         }
        // while(t-->0)
        // {
        //     int cnt=0;
        //     int n=sc.nextInt();
        //     String b=Integer.toBinaryString(n);
        //     for(int i=0;i<b.length();i++)
        //     {
        //         if(b.charAt(i)=='1')
        //             cnt++;
        //     }
        //     System.out.println(cnt);
        // }
//     }
// }
// import java.util.*;
// class Recursion
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int l=sc.nextInt();
//         int r=sc.nextInt();
//         int a=l;
//         for(int i=l+1;i<=r;i++)
//         {
//             a=a&i;
//         }
//         System.out.print(a);
//     }
// }
import java.util.*;
class Recursion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=[[2,3,4],[-1,6,8],[2,8,6]];
        for(int ele:a)
        {
            for(int e:ele)
            {
                System.out.println(e);
            }
        }

    }
}
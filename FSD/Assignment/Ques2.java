import java.util.*;
class Node
{
    int value;
    Node nxt;
    Node(int d)
    {
        value=d;
        nxt=null;
    }
}
class Ques2 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Linkedlist1:");
        int node1=sc.nextInt();
        Node head1=null,t1=null;
        Node head2=null,t2=null;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<node1;i++)
        {
            int d=sc.nextInt();
            Node nn=new Node(d);
            a.add(nn.value);
            if(head1==null)
            {
                head1=nn;
                t1=nn;
            }
            else
            {
                t1.nxt=nn;
                t1=nn;
            }
        }
        System.out.println("Enter size of Linkedlist2:");
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++)
        {
            int d=sc.nextInt();
            Node nn=new Node(d);
            a.add(nn.value);
            if(head2==null)
            {
                head2=nn;
                t2=nn;
            }
            else
            {
                t2.nxt=nn;
                t2=nn;
            }
        }
        Collections.sort(a);
        Node res=null,ta=null;
        for(int i: a)
        {
            Node nn=new Node(i);
            if(res==null)
            {
                res=nn;
                ta=nn;
            }
            else
            {
                ta.nxt=nn;
                ta=nn;
            }
        }
        while(res!=null)
        {
            System.out.print(res.value+" ");
            res=res.nxt;
        }
        sc.close();
    }
}

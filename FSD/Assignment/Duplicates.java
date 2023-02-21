import java.util.*;
class Node{
    int value;
    Node nxt;
    Node(int data)
    {
        value=data;
        nxt=null;
    }
}
class Duplicates
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Linked list:");
        int n=sc.nextInt();
        Node head=null,t=null;
        for(int i=0;i<n;i++)
        {
            int d=sc.nextInt();
            Node nn=new Node(d);
            if(head==null)
            {
                head=nn;
                t=nn;
            }
            else{
                t.nxt=nn;
                t=t.nxt;
            }
        }
        Node res=null,ta=null;
        ArrayList<Integer> al=new ArrayList<>();
        while(head!=null)
        {
            if(!al.contains(head.value))
            {
                al.add(head.value);
                Node nn=new Node(head.value);
                if(res==null)
                {
                    res=nn;
                    ta=nn;
                }
                else{
                    ta.nxt=nn;
                    ta=nn;
                }
            }
            head=head.nxt;
        }
        while(res!=null)
        {
            System.out.print(res.value+" ");
            res=res.nxt;
        }
        sc.close();
    }
}
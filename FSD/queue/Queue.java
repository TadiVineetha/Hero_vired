import java.util.*;
class Queue
{
    public static void main(String args[])
    {
        ArrayList<Integer>queue=new ArrayList<>();
        push(1,queue);
        push(2,queue);
        push(3,queue);
        print(queue);
    }
    public static void push(int ele,ArrayList<Integer>queue)
    {
        queue.add(ele);
    }
    public static void print(ArrayList<Integer>queue)
    {
        for(int ele:queue)
            System.out.print(ele+" ");
        System.out.println();
    }
}
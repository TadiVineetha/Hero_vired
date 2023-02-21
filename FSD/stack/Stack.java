import java.util.*;
class Stack
{

    public static void main(String args[])
    {
        ArrayList<Integer>stack=new ArrayList<>();
        push(1,stack);
        push(2,stack);
        push(3,stack);
        print(stack);
        int removedvalue=pop(stack);
        poppedvalue(removedvalue);
        print(stack);
    }
    public static void push(int ele,ArrayList<Integer>stack)
    {
        stack.add(ele);
    }
    public static void print(ArrayList<Integer>stack)
    {
        for(int ele:stack)
            System.out.print(ele+" ");
        System.out.println();
    }
    public static int pop(ArrayList<Integer>stack)
    {
        if(stack.size()==0)
            return Integer.MAX_VALUE;
        return stack.remove(stack.size()-1);
    }
    public static void poppedvalue(int removedvalue)
    {
        if(removedvalue==Integer.MAX_VALUE)
            System.out.println("Stack is empty");
        else
            System.out.println("The popped value is "+removedvalue);
    }
}
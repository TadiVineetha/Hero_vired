import java.util.*;
class Ques3
{
    static Scanner sc=new Scanner(System.in);
    static void add_pro(ArrayList<String> pro_list,ArrayList<ArrayList<String>> pro_details,ArrayList<Integer> pro_cnt)
    {
        System.out.println("Enter product name:");
        String pname=sc.next();
        pro_list.add(pname);
        System.out.println("Enter qunatity of product:");
        int pquantity=sc.nextInt();
        System.out.println("Enter Specifications:");
        sc.nextLine();
        String speci=sc.nextLine();
        System.out.println("Enter Cost:");
        String cost=sc.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(speci);
        a.add(cost);
        a.add(Integer.toString(pquantity));
        pro_details.add(a);
        pro_cnt.add(pquantity);
    }
    static void view_pro_details(ArrayList<String> pro_list,ArrayList<ArrayList<String>> pro_details,ArrayList<Integer> pro_cnt)
    {
        for(int i=0;i<pro_list.size();i++)
        {
            System.out.print(pro_list.get(i)+"  ");
            String d="";
            for(int j=0;j<pro_details.get(i).size();j++)
            d+=pro_details.get(i).get(j)+" ";
            System.out.print(d);
            System.out.println();
        }
    }
    static void pro_list(ArrayList<String> pro_list,ArrayList<Integer> pro_cnt)
    {
        System.out.println("Enter product name to get count:");
        String name=sc.next();
        int k=pro_list.indexOf(name);
        System.out.println(pro_list.get(k)+" "+pro_cnt.get(k));
    }
    static void edit_pro(ArrayList<String> pro_list,ArrayList<ArrayList<String>> pro_details,ArrayList<Integer> pro_cnt)
    {
        System.out.println("Enter product name to edit details:");
        String p=sc.next();
        int k=pro_list.indexOf(p);
        System.out.println("Enter quantity of product:");
        int pquantity=sc.nextInt();
        System.out.println("Enter Specifications:");
        sc.nextLine();
        String speci=sc.nextLine();
        System.out.println("Enter Cost:");
        String cost=sc.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(speci);
        a.add(cost);
        a.add(Integer.toString(pquantity));
        pro_details.set(k, a);
        pro_cnt.set(k,pquantity);
    }
    static void pro_count(ArrayList<String> pro_list,ArrayList<Integer> pro_cnt)
    {
        System.out.println("Enter product name to get count:");
        String pname=sc.next();
        int i=pro_list.indexOf(pname);
        System.out.println(pro_list.get(i)+"    "+pro_cnt.get(i));
    }
    static void updateinventory(ArrayList<String> pro_list,ArrayList<ArrayList<String>> pro_details,ArrayList<Integer> pro_cnt)
    {
        System.out.println("Enter 1 to add and 2 to delete product quantity");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Enter product name:");
            String pname=sc.next();
            System.out.println("Enter no.of items to add:");
            int n=sc.nextInt();
            int i=pro_list.indexOf(pname);
            pro_cnt.set(i,pro_cnt.get(i)+n);
            int m=pro_cnt.get(i);
            pro_details.get(i).set(2,Integer.toString(m));
        }
        else
        {
            System.out.println("Enter product name:");
            String pname=sc.next();
            System.out.println("Enter no.of items to add:");
            int n=sc.nextInt();
            int i=pro_list.indexOf(pname);
            pro_cnt.set(i,pro_cnt.get(i)-n);
            int m=pro_cnt.get(i);
            pro_details.get(i).set(2,Integer.toString(m));
        }
    }
    public static void main(String[] args) {
        ArrayList<String> pro_list=new ArrayList<>();
        ArrayList<ArrayList<String>> pro_details=new ArrayList<>();
        ArrayList<Integer> pro_cnt=new ArrayList<>();
        System.out.println("Enter no.of items to be added:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        add_pro(pro_list,pro_details,pro_cnt);
        view_pro_details(pro_list, pro_details, pro_cnt);     
    } 
}
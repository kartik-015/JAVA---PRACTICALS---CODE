import java.util.Scanner;

class Area
{
    int l;
    int b;
    Area(int len, int bre)
    {
        l=len;
        b=bre;
    }
    void find_area()
    {
        int area = l*b;
       System.out.println("The area of rectangle is "+area);
    }
}

public class prac_14 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    int l,b;
    System.out.println("Enter the length of rectangle : ");
    l = sc.nextInt();
    System.out.println("Enter the breadth of rectangle : ");
    b = sc.nextInt();
    Area a=new Area(l,b);
    a.find_area();
    System.out.println("KARTIK GULERIA - 23DIT015");
    }
}

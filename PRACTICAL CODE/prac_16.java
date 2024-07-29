
public class prac_16 {
    public static void main(String[] args)
    {
      parent p = new parent();
      child c = new child();
      p.display_1();
      c.display_2();
      c.display_1();
      System.out.println("KARTIK GULERIA - 23DIT015");
    }
}

class parent
{
    void display_1()
    {
        System.out.println("THis is a parent class .");
    }
}

class child extends parent
{
    void display_2()
    {
        System.out.println("This is a child class .");
    }
}

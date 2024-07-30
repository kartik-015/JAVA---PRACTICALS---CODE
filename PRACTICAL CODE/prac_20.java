public class prac_20 {
    public static void main(String[] args)
    {
       Degree d = new Degree();
       d.getDegree();
       Undergraduate u = new Undergraduate();
       u.graduate();
       Postgraduate p = new Postgraduate();
       p.graduate();
    }
}

class Degree
{
   void getDegree()
   {
    System.out.println("I got the degree.");
   }
}

class Undergraduate extends Degree
{
   void graduate()
   {
    System.out.println("I am an Undergraduate.");
   }
}

class Postgraduate extends Degree
{
   void graduate()
   {
    System.out.println("I am a Postgraduate.");
   }
}
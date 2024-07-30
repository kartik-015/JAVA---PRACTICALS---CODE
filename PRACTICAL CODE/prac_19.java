public class prac_19 {
    public static void main(String[] args)
    {
      square s = new square();
      s.printshape();
      s.printrectangle();
    }
}

class shape
{
    void printshape()
    {
        System.out.println("This is a shape.");
    }
}

class rectangle extends shape
{
    void printrectangle()
    {
        System.out.println("This is a rectangle.");
    }
}

class circle extends shape
{
    void printcircle()
    {
        System.out.println("This is a circle.");
    }
}

class square extends rectangle{
        void printsquare()
        {
            System.out.println("Square is a recatngle.");
        }
}
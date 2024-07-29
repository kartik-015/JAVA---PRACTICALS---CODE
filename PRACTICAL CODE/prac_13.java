import java.util.Scanner;

class date
{
    public int day;
    public int month;
    public int year;
    Scanner sc = new Scanner(System.in);
    date()
    {
        day=0;
        month=0;
        year=0;
    }

    void set_day()
    {
      System.out.print("Enter Day : ");
      day = sc.nextInt();
    }

    void set_month()
    {
        System.out.print("Enter Month : ");
        month = sc.nextInt();
    }

    void set_year()
    {
        System.out.print("Enter Year : ");
        year = sc.nextInt();
    }

    void displayDate()
    {
      System.out.println("Date : "+day+"/"+month+"/"+year);
    }

}

public class prac_13 {
    public static void main(String[] args)
    {
        date d = new date();
      d.set_day();
      d.set_month();
      d.set_year();
      d.displayDate();
      System.out.println("KARTIK GULERIA - 23DIT015");
    }
}

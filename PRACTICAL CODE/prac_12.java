import java.util.Scanner; 

class Employee
{
   public String fn ;
   public String ln;
   public double sal;
   Employee()
   {
      fn="0";
      ln="0";
      sal=0;
   }
   Scanner sc= new Scanner(System.in);

   void set_Firstname()
   {
      System.out.print("Enter first name - ");
      fn = sc.nextLine();
   }

   void set_Lastname()
   {
      System.out.print("Enter last name - ");
      ln = sc.nextLine();
   }

   void set_Salary()
   {
      System.out.print("Enter your monthly salary : ");
      sal = sc.nextDouble();
      if(sal<0)
      {
         sal=0;
      }
   }

   void get_firstname()
   {
      System.out.println("The first name is " + fn);
   }

   void get_lastname()
   {
      System.out.println("The last name is " + ln);
   }

   void get_bsalary()
   {
      System.out.println("Before raise , the monthly salary is "+ sal);
   }

   void get_asalary()
   {
      sal = sal +(sal*0.1);
      System.out.println("After raise , the monthly salary is "+sal);
   }
}




public class prac_12 {
     public static void main(String[] args)
     {
      Employee emp1 = new Employee();
      Employee emp2 = new Employee();
      emp1.set_Firstname();
      emp1.set_Lastname();
      emp1.set_Salary();
      System.out.println();
      emp2.set_Firstname();
      emp2.set_Lastname();
      emp2.set_Salary();
      System.out.println();
      emp1.get_firstname();
      emp1.get_lastname();
      emp1.get_bsalary();
      emp1.get_asalary();
      System.out.println();
      emp2.get_firstname();
      emp2.get_lastname();
      emp2.get_bsalary();
      emp2.get_asalary();
      System.out.println("KARTIK GULERIA - 23DIT015");
     }
}

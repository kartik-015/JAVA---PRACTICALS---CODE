import java.util.Scanner;

public class prac_17 {
    public static void main(String[] args)
    {
       employee emp = new employee();
       manager m = new manager();
       emp.details();
       m.details();
       emp.printedetails();
       m.printmdetails();
       System.out.println("KARTIK GULERIA - 23DIT015");
    }
}

class member
{
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    String name;
    int age;
    String number;
    String address;
    int salary;
    void details()
    {
      System.out.print("Enter name : ");
      name = sc.nextLine();
      System.out.print("Enter age : ");
      age = sc.nextInt();
      System.out.print("Enter phone number : ");
      number = sc1.nextLine();
      System.out.print("Enter address : ");
      address = sc2.nextLine();
      System.out.print("Enter salary : ");
      salary = sc.nextInt();
    }
     
    void printedetails() 
    {
        System.out.println("For Employee : ");
        System.out.println("Name : "+ name +" Age : "+age+" Phone no. : "+number+" Address : "+address+" Salary : "+salary);
    }

    void printmdetails() 
    {
        System.out.println("For Employee : ");
        System.out.println("Name : "+ name +" Age : "+age+" Phone no. : "+number+" Address : "+address+" Salary : "+salary);
    }

    void printsalary()
    {
      System.out.println("Salary is " + salary);
    }
}

class employee extends member
{
   String specialization;
}

class manager extends member
{
   String department;
}
import java.util.*; 
 
public class prac_15 { 
   public static void main(String[] args) {       complax o;       o = new complax();       o.sum(); 
      o.diff(); 
      o.mul(); 
      System.out.println("KARTIK GULERIA - 23DIT015"); 
   } 
} 
 
class complax { 
   Scanner sc = new Scanner(System.in);    int re1, im1, re2, im2; 
 
   complax() { 
      System.out.println("Enter the real and imaginary part of the first complex number:");       re1 = sc.nextInt();       im1 = sc.nextInt(); 
      System.out.println("Enter the real and imaginary part of the second complex number:");       re2 = sc.nextInt();       im2 = sc.nextInt(); 
   } 
 
   void sum() { 
      System.out.println("Sum of complex number is:  " + (re1 + re2) + "+" + (im1 + im2) + "i"); 
   } 
 
   void diff() { 
      System.out.println("Difference of complex number is:  " + (re1 - re2) + "+" + (im1 - im2) + "i");
   }
   void mul()
   {
    System.out.println("Product of complex number is "+((re1*re2)-(im1*im2))+"+"+((re1*im2)+(re2*im1))+"i");
   }

}
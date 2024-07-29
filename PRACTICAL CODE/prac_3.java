import java.util.Scanner;  
  
class prac_3  
{  
    public static void main(String[] args) {  
        System.out.print("Enter You mobile number of this formate  (+919624105887): - ");  
        Scanner sc = new Scanner(System.in);         
        long mobile_number = sc.nextLong(10);          
        System.out.println(mobile_number);           
        long x=100000000,y,k,b;         
        y=mobile_number/x;        
        k=mobile_number/100000;  
        System.out.println("Syetem MSc is : - "+k);         b=mobile_number%100000;         k=k-(y*1000);            
        System.out.println("Syetem opreter code is : - "+y);  
        System.out.println("Syetem MSc is : - "+k);  
        System.out.println("Syetem Unique code is : - "+b);  
       System.out.println("KARTIK GULERIA  - 23DIT015");      }  
}  

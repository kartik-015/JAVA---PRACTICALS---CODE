import java.util.*;

public class prac_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "CHARUSAT UNIVERSITY";
        int length = str.length();
        String newString = str.replace('H', 'V');
        System.out.println("Your orignal String is : " + str);
        System.out.println("Length : " + length);
        System.out.println("Converted String is : " + newString.toLowerCase());
        System.out.println("KARTIK GULERIA - 23DIT015");
        sc.close();
        
    }
}

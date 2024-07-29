import java.util.Scanner;
public class prac_8
{
    public static void main(String[] args)
    {
        String s;
        int i,j,no;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string here : ");
        s = sc.nextLine();
        System.out.print("Enter the times you want character to repeat : ");
        no = sc.nextInt();
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            for(j=0;j<no;j++)
            {
             System.out.print(ch);
            }
        }
        System.out.println();
        System.out.print("KARTK GULERIA - 23DIT015");
    }
}
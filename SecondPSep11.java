import java.util.Scanner;

public class SecondPSep11 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number 1:");
        n1=scn.nextInt();
        System.out.println("Enter the Number 2:");
        n2=scn.nextInt();
        String r=n1>n2?"Numbwer 2 is greator":(n1<n2)?"Number 2 is greator":"both are equal";
        System.out.println(r);
    }
}

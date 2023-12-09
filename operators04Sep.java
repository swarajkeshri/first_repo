import java.util.*;

public class operators04Sep {
    public static void main(String[] args) {
        int n, last, second;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the any no.:");
        n = scn.nextInt();
        last = n % 10;
        System.out.println("last Digit:" + last);
        second = (n % 100) / 10;
        System.out.println("Second last digit:" + second);
        System.out.println("Sum of First and last Digit:" + ((n / 100) + (n % 10)));
        scn.close();

    }
}

/* 
step 1
ctrl+p
step 2
>formatdocument+enter
*/
import java.util.Scanner;
public class squareCubeSep05 {
    public static void main(String[] args) {
        long n,square,cube;
        //object 'sc' created to scan data
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = scn.nextLong();
        square = n*n;
        cube = n*n*n;
        System.out.println("Square is : " + square);
        System.out.println("Cube is : " + cube);
    }
}

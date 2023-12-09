import java.util.Scanner;
public class printSepo5 {
public static void main(String[] args){
    int l, b, perimeter, area;
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter length:");
    l = scn.nextInt();
    System.out.print("Enter breadth:");
    b = scn.nextInt();
    area = l * b;
    System.out.println("Area of rectangle:"+area);
    perimeter = 2 * (l + b);
    System.out.println("Perimeter of rectangle:"+perimeter);
    }
}


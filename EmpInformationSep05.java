import java.util.*;
public class EmpInformationSep05 {
    public static void main(String[] args) {
        int a, b;
        String c,x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
        x= sc.nextLine(); 
        System.out.print("Enter EMPID:");
        a=sc.nextInt();   
        System.out.print("Enter Salary:");
        b=sc.nextInt(); 
        System.out.print("Enter Email:");
        y=sc.nextLine(); 
        System.out.print("Enter Address : ");
        z=sc.nextLine();
        System.out.print("Enter Mobile:");
        c=sc.nextLine();
        System.out.println("Name:"+x);
        System.out.println("EMPID:"+a);
        System.out.println("Salary:"+b);
        System.out.println("Email:"+y);
        System.out.println("Address:"+z);
        System.out.println("Mobile:"+c);
    }
}

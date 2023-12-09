import java.util.*;
public class sep06 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the any Number:");
        int n= scn.nextInt();
        int first=n/1000;
        int last=n%10;
        int second=n/100%10;
        int third=n%100/10;
        int result=last+second+third+first;
        System.out.println("the result:"+result);
    }
}

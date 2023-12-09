import java.util.*;
public class Sep22 {
    public static void main(String[] args) {
        /*Scanner scn = new Scanner (System.in);
        System.out.println("Enter the Any Number");
        int n, sum=0;
        n= scn.nextInt();//123
        while(n!=0){ //n=0
            int r=n%10;
            sum =sum+r;//sum =sum+1
            n=n/10;//n=1//10=>0
        }
        System.out.println(sum);*/


        /*Scanner scn = new Scanner (System.in);
        System.out.println("Enter the Any Number");
        int n;
        n= scn.nextInt();
        int count=0;
        while(n!=0){
            int r=n%10;
            n=n/10;//n=1//10=>0
            count++;
        }
        System.out.println("number of digit:"+count);*/

        //sum of even Number
        /*Scanner scn = new Scanner (System.in);
        System.out.println("Enter the Any Number");
        int n, sum=0;
        n= scn.nextInt();
        int count=0;
        while(n!=0){
            int r=n%10;
            if(r%2==0){
                sum=sum+r;
            }
            n=n/10;//n=1//10=>0
        }
        System.out.println("sum of even number"+sum); 
        //Enter the Any Number
        //5489732
        //sum of even number14*/

//9399430276 satish aids

       /*  //Q 4. write a java program to print diffrence of maximum and minimum digits of the given number.
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the Any Number");
        int n, sum=0;
        n= scn.nextInt();
        int r;
        int max=0;
        int min=0;
        while(n!=0){
            r=n%10;
            if(max<r){
                max=r;
            }
            else{
                min=r;
            }
            n=n/10;
        }
        System.out.println("difference"+ (max-min));*/
        //Enter the Any Number
        //1234
        //difference3

        /*//Q 5. Write a java program to reverse number without using pre-define function.
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the Any Number");
        int n, rs=0;
        n= scn.nextInt();//123
        while(n!=0){//n=12
            int r=n%10;//r=2
            rs=rs*10+r;//rs=321
            n=n/10;//0
        }
        System.out.println("Reverse Number:"+rs);
        //Enter the Any Number
        //1234
        //Reverse Number:4321*/

//Q 6.Write a java program to check given number is palidrome or not.
        /*Scanner scn = new Scanner (System.in);
        System.out.println("Enter the Any Number");
        int n, rs=0;
        n= scn.nextInt();//123
        int m=n;
        while(n!=0){//n=12
            int r=n%10;//r=2
            rs=rs*10+r;//rs=321
            n=n/10;//0
        }
        if(m==rs){
            System.out.println("This is  a Palindrome number:"+rs);
        }
        else{
            System.out.println(" this is not a palindrome number:");
        }
        // Enter the Any Number
        // 1331
        // This is  a Palindrome number:1331
        // PS E:\java.pattern\COLLEGE\TNP> cd "e:\java.pattern\COLLEGE\TNP\" ; if ($?) { javac Sep22.java } ; if ($?) { java Sep22 }
        // Enter the Any Number
        // 331
        // this is not a palindrome number:*/


        //Q 7. Write a java program to check given number is Armstrong number.
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the Any Number");
        int n, sum=0;
        n= scn.nextInt();//123
        int m=n;
        while(n!=0){//n=12
            int r=n%10;//r=2
            sum=sum+(r*r*r);//rs=321
            n=n/10;//0
        }
        if(m==sum){
            System.out.println("This is Armstrong number:");
        }
        else{
            System.out.println(" This is not Armstrong number:");
        }
        // Enter the Any Number
        // 5431
        // This is not Armstrong number:
        // PS E:\java.pattern\COLLEGE\TNP> cd "e:\java.pattern\COLLEGE\TNP\" ; if ($?) { javac Sep22.java } ; if ($?) { java Sep22 }
        // Enter the Any Number
        // 351
        // This is not Armstrong number:
    }
}

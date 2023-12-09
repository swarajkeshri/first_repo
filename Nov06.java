import java.util.Scanner;
public class Nov06 {
    public static void main(String[] args) {
//         (private/ protected)

// Access specifier class classNamel //public access specifer recommended for class

// Access specifier data type instance variable Access specifier data type static variable;

// member data/state

// recommended access specifier for member data is private or protected

// Access specifier ClassName(){ //public is a recommended access specifier for the constructor or methods

// access specifier return type methodName(Parameter){
//     }


int l;

int b;

Scanner sk=new Scanner(System.in);

System.out.println("Enter Length:");

l=sk.nextInt();

System.out.println("Enter Breadth :");

b=sk.nextInt();

int ar=l*b;

int pr=2*(l+b);

System.out.println("Area+ar");

System.out.println("Pirameter: "+pr);

    }
}

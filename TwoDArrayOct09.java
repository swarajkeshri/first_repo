import java.util.*;
public class TwoDArrayOct09 {
    public static void main(String[] args) {
        /*int A [][]=new int[3][3];
        A[0][0]=10;
        A[0][1]=20;
        A[0][2]=30;

        A[1][0]=40;
        A[1][1]=50;
        A[1][2]=60;

        A[2][0]=70;
        A[2][1]=80;
        A[2][2]=90;
        System.out.println(""+A[0][0]+"\t"+A[0][1]+"\t"+A[0][2]);
        System.out.println(""+A[1][0]+"\t"+A[1][1]+"\t"+A[1][2]);
        System.out.println(""+A[2][0]+"\t"+A[2][1]+"\t"+A[2][2]);*/
        //output
        // 10      20      30
        // 40      50      60
        // 70      80      90

        /*int A[][]={
            {11,12,13},
            {14,15,16},
            {17,18,19}
        };
        System.out.println(""+A[0][0]+"\t"+A[0][1]+"\t"+A[0][2]);
        System.out.println(""+A[1][0]+"\t"+A[1][1]+"\t"+A[1][2]);
        System.out.println(""+A[2][0]+"\t"+A[2][1]+"\t"+A[2][2]);*/
        // output
        // 11      12      13
        // 14      15      16
        // 17      18      19


        /*int A[][]=new int[3][3];
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter Element Index of 00: ");
        A[0][0]=scn.nextInt();
        System.out.println("Enter Element Index of 01: ");
        A[0][1]=scn.nextInt();
        System.out.println("Enter Element Index of 02: ");
        A[0][2]=scn.nextInt();

        System.out.println("Enter Element Index of 10: ");
        A[1][0]=scn.nextInt();
        System.out.println("Enter Element Index of 11: ");
        A[1][1]=scn.nextInt();
        System.out.println("Enter Element Index of 12: ");
        A[1][2]=scn.nextInt();

        System.out.println("Enter Element Index of 20: ");
        A[2][0]=scn.nextInt();
        System.out.println("Enter Element Index of 21: ");
        A[2][1]=scn.nextInt();
        System.out.println("Enter Element Index of 22: ");
        A[2][2]=scn.nextInt();
        System.out.println(""+A[0][0]+"\t"+A[0][1]+"\t"+A[0][2]);
        System.out.println(""+A[1][0]+"\t"+A[1][1]+"\t"+A[1][2]);
        System.out.println(""+A[2][0]+"\t"+A[2][1]+"\t"+A[2][2]);*/
        // output
        // 0       1       2
        // 10      11      12
        // 20      21      22



        /*int A[][]=new int[3][3];
        Scanner scn= new Scanner(System.in);
        int r,c;
        for(r=0; r<3; r++){//outer loop
            for(c=0; c<3; c++){//inner loop
                System.out.println("Enter Element Index of: "+r+c);
                A[r][c]=scn.nextInt();
            }
        }//input
        System.out.println("output of the array: ");
        for(r=0; r<3; r++){
            for(c=0; c<3; c++){
                System.out.print("\t"+A[r][c]);
            }
            System.out.println(" ");
        }//output*/
        // output of the array:
        // 1       2       3
        // 4       5       6
        // 7       8       9

        int A[][]=new int[3][3];
        int B[][]=new int[3][3];
        int C[][]=new int[3][3];
        int r,c;
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter matrix A");
        for(r=0; r<3; r++){//outer loop
            for(c=0; c<3; c++){//inner loop
                System.out.println("Enter Element Index of: "+r+c);
                A[r][c]=scn.nextInt();
            }
        }//input
        
        System.out.println("output of the matrix B: ");
        for(r=0; r<3; r++){//outer loop
            for(c=0; c<3; c++){//inner loop
                System.out.println("\t"+B[r][c]);
            }
            System.out.println(" ");
        }//input

        System.out.println("output of the matrix C: ");
        for(r=0; r<3; r++){//outer loop
            for(c=0; c<3; c++){//inner loop
                System.out.println("\t"+B[r][c]);
            }
            System.out.println(" ");
        }//output
        System.out.println(""+A[0][0]+"\t"+A[0][1]+"\t"+A[0][2]);
        System.out.println(""+B[1][0]+"\t"+B[1][1]+"\t"+B[1][2]);
        System.out.println(""+C[2][0]+"\t"+C[2][1]+"\t"+C[2][2]);
    }
}

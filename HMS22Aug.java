import java.util.*;
public class HMS22Aug {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int sec = scn.nextInt();
        int S = sec % 60;
        int H = sec / 60;
        int M = H % 60;
            H = H / 60;
        System.out.println("H:M:S - "+ H + ":" + M + ":" + S);
    }
}

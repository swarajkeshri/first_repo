import java.util.Scanner;
public class M01Sep{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names;
        String month_text;
        System.out.println("Month number: ");
        int month = input.nextInt();
        input.close();
        names="January February March April May June July August September November Decmber";
        month_text=names.substring((month-1)*9, month*9);
        System.out.println(month_text);
    }
}
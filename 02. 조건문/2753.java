import java.util.*;

public class Main {

    public static void main(String[] args) {
        int year, bool = 0;
        Scanner scan = new Scanner(System.in);
        year = scan.nextInt();
        if ((year % 4) == 0) {
            bool = 1;
        }
        if ((year % 100) == 0) {
            bool = 0;
        }
        if ((year % 400) == 0) {
            bool = 1;
        }
        System.out.println(bool);

    }
}

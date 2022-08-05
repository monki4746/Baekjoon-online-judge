import java.util.*;

public class Main {

    public static void main(String[] args) {
        int x, y;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        }

    }
}

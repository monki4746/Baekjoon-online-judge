import java.util.*;

public class Main {

    public static void main(String[] args) {
        int H, M;
        Scanner scan = new Scanner(System.in);
        H = scan.nextInt();
        M = scan.nextInt();
        if ((M - 45) < 0) { 		
            H--; 			
            if (H < 0) { 		
                H = 23;
            }
            M = 60 + (M - 45);
        } else { 			
            M -= 45; 			
        }

        System.out.println(H + " " + M);

    }
}

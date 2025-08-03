import java.util.*;

public class primefactorofusernumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1 ) {
            
            return;
        }

       
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i );
                // Divide out all occurrences of i before moving to next i
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
    }
}

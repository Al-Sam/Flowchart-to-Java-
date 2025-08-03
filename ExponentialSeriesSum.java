import java.util.*;

public class ExponentialSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // First line: number of terms (N)
        int x = sc.nextInt(); // Second line: value of X

        if (n < 1 || n > 10 || x < 1 || x > 100) {
            return;
        }

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i) / i;
        }

        System.out.println(Math.round(sum));
    }
}

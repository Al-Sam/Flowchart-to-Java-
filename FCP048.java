import java.util.Scanner;

public class FCP048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); 
        int n = sc.nextInt(); 

        if (m < 1 || n > 1000000 || m > n) {
            return;
        }

        for (int i = m; i <= n; i++) {
            int num = i;
            int digits = 0;

           
            int temp = num;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            
            temp = num;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, digits);
                temp /= 10;
            }

           
            if (sum == num) {
                System.out.println(num); 
            }
        }
    }
}
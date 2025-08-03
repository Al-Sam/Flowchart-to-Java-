import java.util.*;

public class armstronginrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        if (start < 1 || start > end) {
            return;
        }

        for (int i = start; i <= end; i++) {

            int num = i;
            

            int c = 0;
            int t = num;
            while (t > 0) {
                c++;
                t /= 10;
            }

            t = num;
            int sum = 0;
            while (t > 0) {
                int digit = t % 10;
                sum += Math.pow(digit, c);
                t /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
            
        }
    }

}

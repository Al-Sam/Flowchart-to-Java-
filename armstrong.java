import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int r = temp % 10;
            sum += r * r * r;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
} 

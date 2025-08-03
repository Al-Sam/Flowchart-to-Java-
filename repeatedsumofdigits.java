import java.util.*;
public class repeatedsumofdigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n < 1 ) {
            return;
        }
        
        while(n >= 10) {
            int sum = 0;
            while(n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        
        System.out.println(n);
    }
}
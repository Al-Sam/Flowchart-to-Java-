import java.util.*;
public class primenumbercountnnumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n==1 && n==0 ) {
            System.out.println(0);
            return;
        }
        if(n<0){
            return;
        }
        
        int count = 0;
        for(int i = 2; i < n; i++) {
            boolean isPrime = true;
            for(int j = 2; j * j <= i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
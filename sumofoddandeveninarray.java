import java.util.*;
public class sumofoddandeveninarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n < 1 ) {
            return;
        }
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sumOdd = 0, sumEven = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        
        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
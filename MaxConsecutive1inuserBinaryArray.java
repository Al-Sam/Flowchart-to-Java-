import java.util.*;
public class MaxConsecutive1inuserBinaryArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        if(n<1){
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxCount = 0, currentCount = 0;
        
        for (int num : arr) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        
        System.out.println( maxCount);
    }
} 
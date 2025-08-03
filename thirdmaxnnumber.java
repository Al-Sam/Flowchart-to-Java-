import java.util.*;
import java.lang.Math;
public class thirdmaxnnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 3 ) {
            return;
        }
        long max1 = 0, max2 = 0, max3 = 0;
        for (int i = 0; i < n; i++) {
            long num = sc.nextInt();

            if(num >Math.pow(10,8)){
                return; 
            }
            if (max1 == 0 || num > max1) {
                if (max1 != 0 && num != max1) {
                    max3 = max2;
                    max2 = max1;
                }
                max1 = num;
            } else if ((max2 == 0 || num > max2) && num != max1) {
                if (max2 != 0 && num != max2) {
                    max3 = max2;
                }
                max2 = num;
            } else if ((max3 == 0 || num > max3) && num != max1 && num != max2) {
                max3 = num;
            }
        }
        if (max3 == 0) {
           return;
        } else {
            System.out.println(max3);
        }
    }
}
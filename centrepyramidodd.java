import java.util.*;
public class centrepyramidodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); ; // You can change this value to generate a larger or smaller pyramid
        ;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*" + " ");
                
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    
}

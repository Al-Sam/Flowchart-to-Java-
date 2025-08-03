import java.util.*;
public class targetexistinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 1) {
            return; // Invalid input, exit the program
        }
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        boolean found = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                found = true;
                break;
            }
        }
        
        if(found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
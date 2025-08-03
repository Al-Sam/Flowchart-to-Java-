import java.util.*;

public class deletemthelementinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // Number of elements
        int m = sc.nextInt();       // 1-based index of element to delete

        if(n < 1 || m < 1 || m > n) {
            return;
        }

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Shift elements from position m-1 (convert to 0-based)
        for(int i = m - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Print the updated array (excluding last element)
        for(int i = 0; i < n - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}

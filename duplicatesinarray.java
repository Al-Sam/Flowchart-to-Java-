import java.util.*;

public class duplicatesinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n > 100 || n < 1) return;

        int[] arr = new int[n];
        boolean found = false;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // To track already printed duplicates
        for (int i = 0; i < n; i++) {
            boolean duplicateFound = false;
            boolean alreadyPrinted = false;

            // Check if already printed
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) continue;

            // Now check if a duplicate exists ahead
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicateFound = true;
                    break;
                }
            }

            if (duplicateFound) {
                System.out.println(arr[i]);
                found = true;
            }
        }

        if (!found) {
            return;
        }
    }
}

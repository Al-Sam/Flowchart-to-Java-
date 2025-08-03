import java.util.*;
public class minimumelementinmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        
        if(rows<1 || rows>100){
            return;
        }
        int[][] matrix = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int minElement = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
        }
        
        System.out.println(minElement); 
    }
}

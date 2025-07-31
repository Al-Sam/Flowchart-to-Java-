import java.util.*;
public class FCP086 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<(2*N)-1;i++){
			if(i<N){

				for (int j=1;j<=N+i;j++){
					int a = i+j;
					if(a>=N){
						System.out.print("* ");
											
					}else{
						System.out.print("  ");
					}
				}
			}else{

				for (int j = 1; j <= (3 * N - i - 2); j++) {
					int a = j;
					if (a > (i - N + 1)) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				
			}
			System.out.println();
			
		}
	}
}

		
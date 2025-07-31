public class FCP081 {
	public static void main(String[] args){
		int N=5;
		for(int i=1;i<=N;i++){
			for (int j=1;j<=N+i;j++){
				int c=0;
				int a=i+j;
				if (a>N){
					if(a%2==0){
						System.out.print(" *");
						c=c+1;
					}
					else{
						System.out.print("");
					}
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}

					
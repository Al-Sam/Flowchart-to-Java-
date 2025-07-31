import java.util.*;
public class FCP009{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int quotient = a/b;
		int rem= a%b;
		if(rem==0){
			System.out.print((quotient-1)*b);
		}
		else{
			System.out.print(quotient)*b);
		}
	}
}
import java.util.*;
public class FCP004{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		double div=(double)a/b;
		int integer=(int)(a/b);
		int rem=a%b;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(integer);
		System.out.println(rem);

	}
}
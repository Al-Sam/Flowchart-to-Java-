import java.util.*;
public class reversingnumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=0;
		int r=0;
		while(n>0){
            r=n%10;
			num=num*10+r;
			n/=10;
		}
		System.out.println(num);
		
	}
}
import java.util.*;
public class FCP021{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d =sc.nextInt();
		int e =sc.nextInt();
		int f =sc.nextInt();
		int g =sc.nextInt();
		int h =sc.nextInt();
		int m1=0;
		int m2=0;
		
		if (a>b){
			m1=a;
			m2=b;
			
		}else{
			m1=b;
			m2=a;
			
		}if(m2<c){
			m2=c;
			
		}
		if(m1<m2){
			c=m1;
			m1=m2;
			m2=c;
			
		}
		if(m2<d){
			m2=d;
			
		}
		if(m1<m2){
			d=m1;
			m1=m2;
			m2=d;
			
		}
		if(m2<e){
			m2=e;
			
		}
		if(m1<m2){
			e=m1;
			m1=m2;
			m2=e;
			
		}
		if(m2<f){
			m2=f;
			
		}
		if(m1<m2){
			f=m1;
			m1=m2;
			m2=f;
			
		}
		if(m2<g){
			m2=g;
			
		}
		if(m1<m2){
			g=m1;
			m1=m2;
			m2=g;
			
		}
		if(m2<h){
			m2=h;
			
		}
		if(m1<m2){
			h=m1;
			m1=m2;
			m2=h;
			
		}
		
		System.out.println(m2);
	}
}




		

		
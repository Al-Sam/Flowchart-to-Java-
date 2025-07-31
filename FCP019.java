import java.util.*;
public class FCP019{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int Bill=sc.nextInt();
		double first=0.5;
		double second=0.75;
		double third=1.2;
		int Amount=0;
		if(Bill<250){
			first=first*50;
			Bill=Bill-50;
			second=second*100;
			Bill=Bill-100;
			third=Bill*third;
			Amount=(int)(first+second+third+((first+second+third)*0.2));
		}else{
			Amount=(int)((Bill*1.5)+((Bill*1.5)*0.2));
		}
		System.out.println(Amount);
	}
}
			
		
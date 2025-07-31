//FCP018
import java.util.*;
public class FCP018{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int Salary=sc.nextInt();
		int Hra=0;
		int Da=0;
		if(Salary<=1000){
			Hra=(int)(Salary*0.2);
			Da=(int)(Salary*0.8);
			Salary=(int)(Salary+Hra+Da); 
			System.out.print(Salary);

		}else if(Salary <= 20000){
			Hra=(int)(Salary*0.25);
			Da=(int)(Salary*0.9);
			Salary=(int)(Salary+Hra+Da);
			System.out.print(Salary);
		}else{
			Hra=(int)(Salary*0.3);
			Da=(int)(Salary*0.95);
			Salary=(int)(Salary+Hra+Da);
			System.out.println(Salary);
		}
	}
}

			
		
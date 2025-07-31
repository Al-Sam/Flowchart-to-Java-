import java.util.*;
public class FCP020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int t;

        if (a > b) 
	{ 	
		t = a; 
		a = b; 
		b = t; 
	}
        if (a > c) { 
		t = a; 
		a = c; 
		c = t; 
	}
        if (a > d) { 
		t = a; 
		a = d; 
		d = t; 
	}

        if (b > c) { 
		t = b; 
		b = c; 
		c = t; 
	}
        if (b > d) { 
		t = b; 
		b = d; 
		d = t; 
	}

        if (c > d) { 
		t = c; 
		c = d; 
		d = t; 
	}
	System.out.println(c);
    }
}

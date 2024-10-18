import java.util.*;
public class Class432241010335 {
	 public static void main(String[] args) { 
		class MinHeight{
		    int x;
		}
		Scanner sc = new Scanner(System.in);
		MinHeight gravity=new MinHeight();
		MinHeight speedoflight=new MinHeight();
		MinHeight height=new MinHeight();
		gravity.x= sc.nextInt();
		speedoflight.x = sc.nextInt();
		height.x = 1;
		int result = speedoflight.x*speedoflight.x/(2*gravity.x);
		System.out.println("Minimum Height: "+result);
	}
}

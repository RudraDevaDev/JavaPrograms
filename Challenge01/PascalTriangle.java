import java.util.*;
public class Class432241010335 {
	 public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 1;
		int[] a = new int[n+1];
		a[0] = 1;
		for(int i=1;i<=n;i++){
		    a[i] = p*(n-i+1)/i;
		    p = a[i];
		}
		for (int k=0;k<=n;k++) {
		    System.out.print(a[k]+" ");
		}
   }
}

import java.util.*;
public class Class432241010335 {
    private static class NumOfVases{
        int N,K;
		public void result(){
		    double r = K*(Math.pow((K-1),(N-1)));
		    System.out.println((int) r);
		    }
		}
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    NumOfVases vase=new NumOfVases();
	    vase.N= sc.nextInt();
	    vase.K= sc.nextInt();
	    vase.result();
	}
}

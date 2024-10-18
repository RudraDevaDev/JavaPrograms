import java.util.*;
public class Class432241010335 {
    public static class TrainingMat{
        int l,b;
    }
    public static class TrainingCenter{
        int L,B;
    }
	 public static void main(String[] args) { 
		Scanner Sc = new Scanner(System.in);
	    TrainingMat mat=new TrainingMat();
	    TrainingCenter hall=new TrainingCenter();
	    mat.l= Sc.nextInt();
	    mat.b= Sc.nextInt();
	    hall.L= Sc.nextInt();
	    hall.B= Sc.nextInt();
	    int or1 = ((hall.L/mat.l)*(hall.B/mat.b));
	    int or2 = ((hall.L/mat.b)*(hall.B/mat.l));
	    int matmax = Math.max(or1, or2);
	    System.out.print(matmax);
	}
}

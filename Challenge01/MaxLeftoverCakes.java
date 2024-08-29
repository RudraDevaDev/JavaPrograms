import java.util.*;
public class MaxLeftoverCakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Max Cake Value:");
        n = sc.nextInt();
        sc.close();
        int m = (n/2)+1;
        System.out.println("Max leftover Cakes :"+m);
    }
}

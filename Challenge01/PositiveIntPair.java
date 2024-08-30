import java.util.*;
public class PositiveIntPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int U,V,W;
        System.out.println("Enter value U:");
        U = sc.nextInt();
        System.out.println("Enter value V:");
        V = sc.nextInt();
        sc.close();
        W = U*V/2+((U%2)*(V%2));
        System.out.println("Number of Positive int Pair:"+W);
    }
}

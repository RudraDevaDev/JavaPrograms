import java.util.*;
public class LeastStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,a;
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        sc.close();
        int lenght = (n+a-1)/a;
        int width = (m+a-1)/a;
        int stones = lenght*width;
        System.out.println("Least stones required :"+stones);
    }
}

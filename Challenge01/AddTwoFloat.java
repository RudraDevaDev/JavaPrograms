import java.util.*;
public class AddTwoFloat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float var1,var2;
        System.out.println("Enter variable 1 value:");
        var1 = sc.nextInt();
        System.out.println("Enter variable 2 value:");
        var2 = sc.nextInt();
        sc.close();
        float total = var1+var2;
        System.out.printf("%.3f",total);
    }
}
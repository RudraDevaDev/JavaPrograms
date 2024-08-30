import java.util.*;
public class Total{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z,total;
        System.out.println("Enter no of Tickets:");
        x = sc.nextInt();
        System.out.println("Enter no of Tickets:");
        y = sc.nextInt();
        System.out.println("Enter no of Tickets:");
        z = sc.nextInt();
        total = x+y+z;
        System.out.println("Total no of tickets:"+total);
        sc.close();
    }
}
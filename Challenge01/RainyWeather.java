import java.util.Scanner;
public class Class432241010335 {
    public static class WeatherReport{
    int []days=new int[7];
    }
    public static void main(String[] args) {
        WeatherReport rain=new WeatherReport();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            rain.days[i]=sc.nextInt();
        }
        int sunnyDays = 0;
        int rainyDays = 0;
        for (int i = 0; i < 7; i++) {
            if (rain.days[i] == 1) {
                sunnyDays++;
            } else {
                rainyDays++;
            }
        }
        if (sunnyDays > rainyDays) {
            System.out.println("GOOD WEATHER");
        } else {
            System.out.println("RAIN ALERT");
        }
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println(String.format("%.2f", a));
        sc.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(a + b + c);
        System.out.printf("%.1f", (float) (a + b + c) / 3);
        sc.close();
    }
}

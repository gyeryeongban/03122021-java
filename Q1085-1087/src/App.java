import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1085
        int h = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), s = sc.nextInt();
        double total = 0;
        if (h >= 1 && h <= 48000 && b <= 32 && b % 8 == 0 && c >= 1 && c <= 5 && s >= 1 && s <= 6000) {
            total = h * b * c * s;
        }
        double result = ((total / 8) / Math.pow(2, 10)) / Math.pow(2, 10);
        System.out.printf("%.1fMB", result);

        // 1086
        int d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt();
        double total2 = 0;
        if (d >= 1 && d <= 1024 && e >= 1 && e <= 1024 && f <= 40 && f % 4 == 0) {
            total2 = d * e * f;
        }
        double result2 = ((total2 / 8) / Math.pow(2, 10)) / Math.pow(2, 10);
        System.out.printf("%.2fMB", result2);

        // 1087
        int g = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= g; i++) {
            sum += i;
            if (sum >= g) {
                System.out.println(sum);
                break;
            }
        }
        sc.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1090
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        for (int i = 1; i < c; i++) {
            a *= b;
        }
        System.out.println(a);

        // 1091
        int d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt(), g = sc.nextInt();
        if (d >= -50 && d <= 50 && e >= -50 && e <= 50 && f >= -50 && f <= 50 && g >= 1 && g <= 10) {
            for (int i = 1; i < g; i++) {
                d = d * e + f;
            }
            System.out.println(d);
        }

        // 1092
        int h = sc.nextInt(), i = sc.nextInt(), j = sc.nextInt();
        int day = 1;
        while (day % h != 0 || day % i != 0 || day % j != 0) {
            day++;
        }
        System.out.println(day);
        sc.close();
    }
}

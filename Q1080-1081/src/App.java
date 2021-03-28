import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1080
        int a = sc.nextInt();
        int sum1 = 0, sum2 = 0;
        if (a >= 0 && a <= 1000) {
            while (sum1 < a) {
                sum2++;
                sum1 += sum2;
            }
        }
        System.out.println(sum2);

        // 1081
        int b = sc.nextInt(), c = sc.nextInt();
        for (int i1 = 1; i1 <= b; i1++) {
            for (int i2 = 1; i2 <= c; i2++) {
                System.out.println(i1 + " " + i2);
            }
        }
        sc.close();
    }
}

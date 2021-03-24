import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1071
        while (true) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            System.out.println(a);
        }

        // 1072
        int b = sc.nextInt();
        int[] c = new int[b];
        for (int i = 0; i < c.length; i++) {
            c[i] = sc.nextInt();
            System.out.println(c[i]);
        }

        // 1073
        while (true) {
            int d = sc.nextInt();
            if (d == 0) {
                break;
            }
            System.out.println(d);
        }

        // 1074
        int e = sc.nextInt();
        if (e >= 1 && e <= 100) {
            for (int i = e; i > 0; i--) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1053
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println(1);
        } else if (a == 1) {
            System.out.println(0);
        }

        // 1054
        int b = sc.nextInt(), c = sc.nextInt();
        if (b == 1 && c == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        // 1055
        int d = sc.nextInt(), e = sc.nextInt();
        if (d == 1 || e == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}

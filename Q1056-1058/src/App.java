import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1056
        int a = sc.nextInt(), b = sc.nextInt();
        if (a != b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        // 1057
        int c = sc.nextInt(), d = sc.nextInt();
        if (c == d) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        // 1058
        int e = sc.nextInt(), f = sc.nextInt();
        if (e == 0 && f == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 1088
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i % 3 != 0) {
                System.out.printf(i + " ");
            }
        }

        // 1089
        int b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        for (int i = b; i < d; i++) {
            b += c;
        }
        System.out.println(b);
        sc.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1075
        int a = sc.nextInt();
        if (a >= 0 && a <= 100) {
            for (int i = a; i > 0; i--) {
                System.out.println(i - 1);
            }
        }

        // 1076
        char b = sc.next().charAt(0);
        char start = 'a';
        do {
            System.out.print(start + " ");
            start += 1;
        } while (start <= b);

        // 1077
        int c = sc.nextInt();
        for (int i = 0; i <= c; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}

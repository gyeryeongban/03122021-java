import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1078
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        // 1079
        while (true) {
            char b = sc.next().charAt(0);
            if (b == 'q') {
                System.out.println(b);
                break;
            }
            System.out.println(b);
        }
        sc.close();
    }
}

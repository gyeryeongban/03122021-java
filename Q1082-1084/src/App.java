import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 1082
        String st = sc.nextLine();
        int a = Integer.parseInt(st, 16);
        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X%n", a, i, a * i);
        }

        // 1083
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.printf("X ");
            } else {
                System.out.printf(i + " ");
            }
        }

        // 1084
        int c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt();
        int count = 0;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                for (int k = 0; k < e; k++) {
                    System.out.println(i + " " + j + " " + k);
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}

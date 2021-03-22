import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1059
        int a = sc.nextInt();
        System.out.println(~a);

        // 1060
        int b = sc.nextInt(), c = sc.nextInt();
        System.out.println(b & c);

        // 1061
        int d = sc.nextInt(), e = sc.nextInt();
        System.out.println(d | e);

        // 1062
        int f = sc.nextInt(), g = sc.nextInt();
        System.out.println(f ^ g);
        sc.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1047
        int a = sc.nextInt();
        System.out.println(a << 1);

        // 1048
        int b = sc.nextInt(), c = sc.nextInt();
        System.out.println(b << c);
        sc.close();
    }
}

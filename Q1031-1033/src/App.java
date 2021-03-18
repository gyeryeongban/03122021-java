import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1031
        int a = sc.nextInt();
        String ocalString = Integer.toOctalString(a);
        System.out.println(ocalString);

        // 1032
        int b = sc.nextInt();
        System.out.printf("%h", b);

        // 1033
        int c = sc.nextInt();
        System.out.printf("%X", c);
        sc.close();
    }
}

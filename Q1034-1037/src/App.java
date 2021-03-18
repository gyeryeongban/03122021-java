import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1034
        String s1 = sc.nextLine();
        int a = Integer.parseInt(s1, 8);
        System.out.println(a);

        // 1035
        String s2 = sc.nextLine();
        int b = Integer.parseInt(s2, 16);
        // 1035 A1
        System.out.printf("%o", b);
        // 1035 A2
        String octal = Integer.toOctalString(b);
        System.out.println(octal);

        // 1036
        char c = sc.next().charAt(0);
        System.out.println((int) c);

        // 1037
        int d = sc.nextInt();
        System.out.println((char) d);
        sc.close();
    }
}

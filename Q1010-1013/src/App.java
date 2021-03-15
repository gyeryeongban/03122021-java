import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1010
        int a = sc.nextInt(15);
        System.out.println(a);

        // 1011
        String b = sc.next("p");
        System.out.println(b);

        // 1012
        float c = sc.nextFloat();
        System.out.println(c);

        // 1013
        int d = sc.nextInt(), e = sc.nextInt();
        System.out.println(d + " " + e);
        sc.close();
    }
}

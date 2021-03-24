import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1063
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a > b ? a : b);

        // 1064
        int c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt();
        System.out.println((c < d ? c : d) < e ? (c < d ? c : d) : e);
        sc.close();
    }
}

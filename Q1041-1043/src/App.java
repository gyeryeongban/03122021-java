import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1041
        char a = sc.next().charAt(0);
        System.out.println((char) (a + 1));

        // 1042
        int b = sc.nextInt(), c = sc.nextInt();
        System.out.println(b / c);

        // 1043
        int d = sc.nextInt(), e = sc.nextInt();
        System.out.println(d % e);
        sc.close();
    }
}

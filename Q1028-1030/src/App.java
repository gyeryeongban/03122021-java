import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1028
        long i = sc.nextLong();
        System.out.println(i);

        // 1029
        double d = sc.nextDouble();
        System.out.printf("%.11f", d);

        // 1030
        long l = sc.nextLong();
        System.out.println(l);
        sc.close();
    }
}

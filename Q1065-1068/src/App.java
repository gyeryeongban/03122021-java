import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1065
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a);
        }
        if (b % 2 == 0) {
            System.out.println(b);
        }
        if (c % 2 == 0) {
            System.out.println(c);
        }

        // 1066
        int d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt();
        if (d % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (e % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (f % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // 1067
        int g = sc.nextInt();
        if (g < 0) {
            System.out.println("minus");
        } else {
            System.out.println("plus");
        }
        if (g % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // 1068
        int h = sc.nextInt();
        if (h >= 90 && h <= 100) {
            System.out.println("A");
        } else if (h >= 70 && h <= 89) {
            System.out.println("B");
        } else if (h >= 40 && h <= 69) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        sc.close();
    }
}

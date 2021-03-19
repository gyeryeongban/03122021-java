import java.util.Scanner;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // A1
        String a1 = sc.nextLine();
        String[] b1 = a1.split(" ");
        long c1 = Long.parseLong(b1[0]);
        long d1 = Long.parseLong(b1[1]);
        System.out.println(c1 + d1);
        // A2
        String a2 = sc.nextLine();
        StringTokenizer b2 = new StringTokenizer(a2, " ");
        String[] arr = new String[2];
        int i = 0;
        while (b2.hasMoreTokens()) {
            arr[i] = b2.nextToken();
            i++;
        }
        long c2 = Long.parseLong(arr[0]);
        long d2 = Long.parseLong(arr[1]);
        System.out.println(c2 + d2);
        sc.close();
    }
}

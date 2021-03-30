import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int[][] arr = new int[19][19];
        arr[19][19] = 0;
        for (int i = 1; i <= arr.length; i++) {
        }
        for (int j = 1; j <= 19; j++) {
            for (int k = 1; k <= 19; k++) {
                System.out.println(arr[a][b]);
            }
            System.out.println("\n");
        }
        sc.close();
    }
}

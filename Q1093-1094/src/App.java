import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1093
        int[] arr1 = new int[24]; // 0-23
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            arr1[b] += 1;
        }
        for (int i = 1; i < arr1.length; i++) {
            System.out.printf(arr1[i] + " ");
        }

        // 1094
        int c = sc.nextInt();
        int[] arr2 = new int[c];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.printf(arr2[i] + " ");
        }
        sc.close();
    }
}

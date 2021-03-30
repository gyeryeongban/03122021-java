import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 24;
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 1; i < a; i++) {
            arr[i] = sc.nextInt();
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println(min);
        sc.close();
    }
}

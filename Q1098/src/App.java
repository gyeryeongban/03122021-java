import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("설탕과자 몇개 뽑을 겁니까?: ");
        int n = sc.nextInt();
        int[][] arr = new int[5][5];
        for (int i = 0; i < n; i++) {
            System.out.print("x: ");
            int x = sc.nextInt();
            System.out.print("y: ");
            int y = sc.nextInt();
            arr[x - 1][y - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}

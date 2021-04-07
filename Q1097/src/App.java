import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        System.out.print("바둑돌을 몇번 두실 겁니까?: ");
        int n = sc.nextInt();
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

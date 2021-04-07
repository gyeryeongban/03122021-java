import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt(), b = sc.nextInt();
        // int[][] arr = new int[19][19];
        // arr[19][19] = 0;
        // for (int i = 1; i <= arr.length; i++) {
        // }
        // for (int j = 1; j <= 19; j++) {
        // for (int k = 1; k <= 19; k++) {
        // System.out.println(arr[a][b]);
        // }
        // System.out.println("\n");
        // }
        // sc.close();
        Scanner sc = new Scanner(System.in);
        System.out.print("바둑돌을 몇번 두실 겁니까?: ");
        int n = sc.nextInt(); // 스캐너로 입력받을 때/ 몇 번 입력받을 지 정하지 X
        // int n = 5; // 몇 번 입력받을지
        int[][] arr = new int[19][19]; // [행][열]
        // 행과 열 입력받기
        for (int i = 0; i < n; i++) { // i=0은 처음만 실행되고 더이상 실행 x; i는 18까지;
            System.out.print("x: ");
            int x = sc.nextInt();
            System.out.print("y: ");
            int y = sc.nextInt();
            arr[x - 1][y - 1] = 1; // 행 x와 열 y에 1 넣어줌
                                   // -1을 넣어주지 않으면 [0][0] 자리에 1을 넣어야 할게 [1][1]에 넣어짐
        }
        // 행과 열 출력하기
        for (int i = 0; i < arr.length; i++) { // i=0은 처음만 실행되고 더이상 실행 x; i는 배열 길이보다 작을 때까지;
            for (int j = 0; j < arr[i].length; j++) { // // j=0은 처음만 실행되고 더이상 실행 x; j는 배열 행의 길이보다 작을 때까지;
                // System.out.println("행: " + i + ", 열: " + j + ", arr 값: " + arr[i][j]);
                System.out.print(arr[i][j]); // 행과 열 출력
            }
            System.out.println(); // j가 arr[i]에 길이보다 커지기 전까지 출력/ 줄바꿈 용도
        }
        sc.close();
    }
}

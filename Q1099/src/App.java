import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];

        // for (int i = 1; i<arr.length; i++) {
        // for (int j = 1; j<arr.length; j++) {
        // arr[i][j] = 9;
        // }
        // }
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // if (arr[i][j] == 2) {
        // arr[i][j] == 9;
        // break;
        // }
        // if (arr[i][j] == 0) {
        // arr[i][j] == 9;
        // } else (arr[i][j] == 1) {
        // arr[i+1][j];
        // }

        // 지도 입력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt(); // 지도를 입력을 받기 위해 필요함/ 안써주면 지도가 0으로만 입력됨
            }
        }
        System.out.println();

        boolean flag = false; // 구분을 위해 선언

        // 개미 흔적 입력 (개미가 이동합니다)
        for (int i = 1; i < arr.length - 1; i++) { // -1을 해주는 이유 = (8,8)까지 움직일 수 있어서
            for (int j = 1; j < arr[i].length - 1; j++) { // -1을 해주는 이유 = (8,8)까지 움직일 수 있어서
                // 만약 이곳이 (8, 8 이라면 끝)
                if (i == 8 && j == 8) { // ==는 같아? 라는 뜻 (==는 if문에서 사용)
                    arr[i][j] = 9;
                    break;
                }
                // 만약 여기에 먹이가 있다면
                if (arr[i][j] == 2) {
                    arr[i][j] = 9;
                    flag = true;
                    break;
                }
                // 오른쪽도 1(벽)이고, 아래도 1(벽)이면 멈춘다.
                if (arr[i][j + 1] == 1 && arr[i + 1][j] == 1) {
                    arr[i][j] = 9;
                    flag = true;
                    break;
                }
                // 오른쪽이 벽이면 아래로 간다.
                if (arr[i][j + 1] == 1) {
                    arr[i][j] = 9;
                    break;
                }
                // 개미가 이 땅을 밟으면 흔적 남기기
                arr[i][j] = 9;
            }
            if (flag) {
                break;
            }
        }

        // 지도와 개미 흔적 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

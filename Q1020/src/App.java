import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        // 000000-000000 or 000000 000000 입력
        String front = number.substring(0, 6); // 0번째 숫자부터 5번째 숫자까지 주민등록번호 앞자리
        String back = number.substring(7); // 주민등록번호 뒷자리
        // 0000000000000 입력
        // String front = number.substring(0, 6);
        // String back = number.substring(6, 13);
        System.out.println(front + "-" + back);
        sc.close();
    }
}

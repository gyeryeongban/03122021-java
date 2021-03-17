import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int id = 0; // 0번째 인덱스부터 내림차 순
        for (int i = num.length() - 1; i >= 0; i--) // 내림차 순이니 감소 형식
            System.out.println("[" + Integer.parseInt(String.valueOf(num.charAt(id++))) * (int) Math.pow(10, i) + "]");
        // valueOf로 입력값의 0번째 인덱스 부터 정수로 변환 후, Math.pow 함수의 10과 num.length-1 제곱을 한 뒤 곱한다.
        // 반복은 입력받은 문자열 수 -1만큼 해줘야 하는데 그 이유는 제곱근식이 성립하기 위함이다.
        // i범위가 0을 포함하는 이유는 모든 0의 거듭 제곱근은 1의 자리까지 출력하기 위함이다.
        sc.close();
    }
}

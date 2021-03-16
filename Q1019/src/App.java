import java.util.Scanner;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ymd = sc.nextLine(); // 연월일을 문자열로 입력받기
        StringTokenizer st = new StringTokenizer(ymd, "."); // "."으로 구분해서 문자열 잘라주기
        int[] arr = new int[3]; // 길이 3의 int보관 배열 선언하기
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken()); // 입력 문자열을 int 배열에 넣기 위해 int로 형변환해주기
            i += 1;
        }
        String year = String.format("%04d", arr[0]);
        String month = String.format("%02d", arr[1]); // 월을 한자리 수로 입력했기 때문에 %02d
        String day = String.format("%02d", arr[2]); // 일을 한자리 수로 입력했기 때문에 %02d
        System.out.println(year + "." + month + "." + day);
        sc.close();
    }
}

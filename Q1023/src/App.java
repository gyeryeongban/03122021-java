import java.util.Scanner;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        StringTokenizer st = new StringTokenizer(num1, ".");
        String[] num2 = new String[2];
        int i = 0;
        while (st.hasMoreTokens()) {
            num2[i] = st.nextToken();
            i++; // i+=1;
        }
        System.out.println(num2[0] + "\n" + num2[1]);
        sc.close();
    }
}

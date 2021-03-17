import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ymd = sc.nextLine();
        String[] ymds = ymd.split("\\.");
        System.out.println(ymds[2] + "-" + ymds[1] + "-" + ymds[0]);
        sc.close();
    }
}

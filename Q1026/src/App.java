import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.nextLine();
        String[] t2 = t1.split(":");
        System.out.println(Integer.parseInt(t2[1]));
        sc.close();
    }
}

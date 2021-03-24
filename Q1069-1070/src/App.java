import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1069
        char ca = sc.next().charAt(0);
        switch (ca) {
        case 'A':
            System.out.println("best!!!");
            break;
        case 'B':
            System.out.println("good!!!");
            break;
        case 'C':
            System.out.println("run!");
            break;
        case 'D':
            System.out.println("slowly~");
            break;
        default:
            System.out.println("what?");
        }

        // 1070
        int a = sc.nextInt();
        switch (a) {
        case 12:
        case 1:
        case 2:
            System.out.println("winter");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("spring");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("summer");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("fall");
            break;
        }
        sc.close();
    }
}

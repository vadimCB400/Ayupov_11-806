import java.util.Scanner;

public class HWlesson5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку.");
        String q = sc.nextLine();
        System.out.println("i или u");
        String w = sc.nextLine();
        if (w.equals("i")) {
            q = q.toLowerCase();
        }
        else if (w.equals("u")) {
            q = q.toUpperCase();
        }
        System.out.println(q);
    }
}

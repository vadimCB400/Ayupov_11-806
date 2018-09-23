import java.util.Scanner;

public class HWlesson4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();
        String q = "";
        System.out.println("Введите любое положительое число.");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char t = str.charAt(str.length() - 1);
            q += t;
            for (int j = 0; j < str.length() - 1; j++) {
                char w = str.charAt(j);
                q += w;
            }
            str = q;
            q = "";
        }
        System.out.println(str);
    }
}

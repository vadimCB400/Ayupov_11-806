import java.util.Scanner;

public class HWlesson5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        char[] e = b.toCharArray();
        int q = 0;
        int w = 1;
        for (int i = e.length - 1; i >= 0; i--) {
            int n = Character.digit(e[i], 10);
            while (n > 0) {
                q += n % 10 * w;
                n /= 10;
                w *= 10;
            }

        }
        System.out.println(q);
    }
}

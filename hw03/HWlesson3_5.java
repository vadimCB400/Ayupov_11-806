import java.util.Scanner;

public class HWlesson3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        int[] arr = new int[n];
        int m = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            while (arr[i] > 0) {
                t = t + (arr[i] % 10) * m;
                arr[i] = arr[i] / 10;
                m = m * 10;
            }
        }
        System.out.print(t);
    }
}

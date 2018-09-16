import java.util.Scanner;

public class HWlesson3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 0;// Сумма элементов.
        double x; // Средний рост.
        int t = 0; // Сумма элементов коорые больше или равны среднему значению.
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            l = l + arr[i];
        }
        x = l/n;
        for (int i = 0; i < n; i++)
            if (arr[i] >= x) t++;
        System.out.println(x);
        System.out.println(t);
    }
}





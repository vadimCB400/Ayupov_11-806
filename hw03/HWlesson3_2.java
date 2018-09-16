import java.util.Scanner;

public class HWlesson3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;//Максимальный элемент.
        int c = 0;//Индекс максимального элемента.
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
                for (int i = 0; i < n ; i++) {
            if (t <= arr[i])
                t = arr[i];
            c = i;
        }
            System.out.println(t);
            System.out.println(c);
        }
    }





import java.util.Scanner;
public class HWlesson3_6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    for (int i = 0; i <= (n - 1) / 2; i++) {
        k = arr[i];
        arr[i] = arr[(n - 1) - i];
        arr[(n - 1) - i] = k;
    }
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
}
}



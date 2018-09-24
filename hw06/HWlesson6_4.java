import java.util.Scanner;

public class HWlesson6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = false;
        System.out.println("Введите количестко элементов в массиве");
        int n = sc.nextInt();
        System.out.println("Введите любые целые числа");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if(arr[i] == arr[j]){
                    f = true;
                }

            }
        }
        System.out.println(f);

    }
}

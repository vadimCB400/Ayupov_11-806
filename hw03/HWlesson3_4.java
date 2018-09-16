import java.util.Scanner;
public class HWlesson3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean c = false;
        boolean d = false;
        for (int i = 0; i < n-1 ; i++) {
            if (arr[i] <= arr[i+1] && d == false) {
                c = true;
            }
            else if (arr[i] > arr[i+1]){
                d = true;
            }
            else {
                c = false;
            }

        }
        System.out.println(c);
    }
}

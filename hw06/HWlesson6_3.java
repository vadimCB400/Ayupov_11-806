import java.util.Scanner;

public class HWlesson6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int q = 0;
        int w = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] == arr[i + 1]) q++;
            else q = 0;
            if(q > w){
                w = q;
            }
        }
        w = w + 1;
        System.out.println(w);
    }
}

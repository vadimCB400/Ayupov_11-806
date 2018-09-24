import java.util.Scanner;

public class HWlesson6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int w = sc.nextInt();
        int[] aarr = new int[q];
        int[] barr = new int[w];
        for (int i = 0; i < q; i++) {
            aarr[i] = sc.nextInt();
        }
        for (int i = 0; i < w; i++) {
            barr[i] = sc.nextInt();
        }
        int z = 0;
        int x = 0;
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < w; j++) {
                if (aarr[i] == barr[j]) {
                    z++;
                }

            }
        }
        x = q + w - 2 * z;
        System.out.println(x);
    }
}


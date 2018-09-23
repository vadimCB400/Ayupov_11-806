import java.util.Scanner;

public class HWlesson4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aarr = new int[n];
        for (int i = 0; i < n; i++) {
            aarr[i] = sc.nextInt();
        }
        int h = sc.nextInt();
        int t = 0;
        int l = h -1;
        int[] barr = new int[h];
        for (int i = 0; i < h; i++) {
            barr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
           int k = i - t;
           if(aarr[i] == barr[t]) {
               if (t == 1) {
                   System.out.println(k);
                   break;
               }
               t++;
           }
        }
    }
}



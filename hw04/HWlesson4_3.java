import java.util.Scanner;

public class HWlesson4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String q = sc.nextLine();
        System.out.println("Введите первое число:");
        int w = sc.nextInt();
        System.out.println("Введите второе число:");
        int e = sc.nextInt();
        String strResult = "";
        for (int i = 0; i < q.length(); i++) {
            char s = q.charAt(i);
            if ((w > i) | (i > e)){
                strResult += s;
            }
        }
        System.out.println(strResult);
    }
}

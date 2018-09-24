import java.util.Scanner;
public class HWlesson6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String f = "";
        for (int i = 0; i < s.length(); i++) {
            char sy = s.charAt(i);
            if (sy != ' '){
                f += sy;
            }
        }
        System.out.println(f);
    }
}

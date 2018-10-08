package ClassTestTask01;

import java.util.Scanner;

public class ClassTest02 {
    public static boolean p = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(o(0, str)) System.out.println("yes");
         else System.out.println("No");
        }
        public static boolean o(int ind, String str) {
            if (ind < str.length() / 2) {
                if (str.charAt(ind) == str.charAt(str.length() - ind - 1) && p) {
                    o(ind += 1, str);
                } else {
                    p = false;
                }
            }
            return p;
        }
}

import java.util.Scanner;

public class HWlesson5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String snew = "";
        //String new = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'o' | c == '1' | c == '2' | c == '3' | c == '4' | c == '5' | c == '6' | c == '7' | c == '8' | c == '9') {
                c = '*';
            }
            else if (c == ' ' ){
                c = ' ';
            }
            snew += c;
        }
        System.out.println(snew);
    }
}

import java.util.Scanner;

public class HWlesson5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        String u = "n";
        while (1 == 1) {
            if (u.equals("n")) {
                System.out.println("Введите число n");
                n = ++n;
                double res = 0;
                System.out.println("введите первое число");
                double t = sc.nextDouble();
                System.out.println("введите оператор");
                String o = sc.next();
                System.out.println("введите второе число");
                double b = sc.nextDouble();
                n = ++n;
                if (o.equals("+")) {
                    res = t + b;
                }
                else if (o.equals("-"))
                    res = t - b;
                else if (o.equals("/"))
                    res = t / b;
                else if (o.equals("*"))
                    res = t * b;
                System.out.println(res);
            }
            System.out.println("Сбросить?");
            u = sc.next();
        }
        else if ("y".equals(u)){
            n = 1;
            u = "n";
        }
    }
}

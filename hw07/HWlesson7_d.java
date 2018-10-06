public class HWlesson7_d {
    public static void main(String[] args) {
        abc(128);
    }
    static void abc(double a) {
        if (a > 1) {
            abc(a / 2);
        }
        if (a == 1) {
            System.out.println("YES");
        }
        if (a < 1) {
            System.out.println("NO");

        }
            
        }

    }


package ClassTestTask01;
//var 2
import java.util.Scanner;

public class ClassTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 3;
        int p = n * n;
        int[] arr = new int[n * n];
        int[][] matrix1 = new int[m][m];
        for (int i = 0; i < p; i++) {
            arr[i] = sc.nextInt();
        }
        sortArr(arr);
        spiralFill(matrix1, arr);
        System.out.println(underDiagonalSum(matrix1, n));
    }

    public static int[] sortArr(int[] arr) {
        int u;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] < arr[j]) {
                        u = arr[j];
                        arr[j] = arr[i];
                        arr[i] = u;
                    }
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
        System.out.println();
        return arr;
    }

    public static int[][] spiralFill(int[][] matrix1, int[] arr) {
        int z = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = i; j < matrix1.length - i; j++) {
                matrix1[i][j] = arr[z];
                z++;
            }
            for (int j = i + 1; j < matrix1.length - i; j++) {
                matrix1[j][matrix1.length - i - 1] = arr[z];
                z++;
            }
            for (int j = matrix1.length - i - 2; j >= i; j--) {
                matrix1[matrix1.length - i - 1][j] = arr[z];
                z++;
            }
            for (int j = matrix1.length - i - 2; j >= i + 1; j--) {
                matrix1[j][i] = arr[z];
                z++;
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
        }
        return matrix1;
    }
    public  static int underDiagonalSum(int[][] matrix1, int n) {
        int sum = 0;
        System.out.println();
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += matrix1[i][j];
            }

        }
        return sum;
    }
}





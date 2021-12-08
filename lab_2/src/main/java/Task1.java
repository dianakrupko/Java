/*9. Сформировать массив b из  исходного одномерного массива a по следующему алгоритму:
сначала идут элементы массива a с четными значениями в порядке их возрастания,
затем элементы    с нечетными значениями в порядке их убывания.
Для определения количества четных элементов используйте оператор взятия модуля “%”.  */

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter numbers: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        double[] a = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Double.parseDouble(arr[i]);
        }

        int n=a.length;
        double[] b = new double[n];
        System.out.print("a" + Arrays.toString(a));
        Arrays.sort(a, 0, a.length);
        int k = returncount(a);
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
//                k += 1;
                if (x < k) {
                    b[x] = a[i];
                    x++;
                }
            }
        }

        int y=k;
        for (int j = a.length - 1; j >= 0; j--) {
            if (a[j] % 2 != 0) {
                k += 1;
                if(y<n) {
                    b[y] = a[j];
                    y++;
                }
            }
        }
        System.out.print("\nb" + Arrays.toString(b));

    }
    public static int returncount(double [] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                k += 1;
            }
        }
        return k;
    }
}


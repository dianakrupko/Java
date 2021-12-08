/*25. Сформировать массив b из массива a  следующим образом: массив  b
состоит из тех элементов массива a, которые повторяются в массиве,
например, для массива a: 3 7 4 3 8 7 5, массив b будет иметь вид: 3 7.*/
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter numbers: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        int n=a.length;
        Arrays.sort(a, 0, n);
        int k = returnCount(a);
        int x = 0;
        int[] b = new int[n];
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
//                k += 1;
                if (x < k) {
                    b[x] = a[i];
                    System.out.print(b[x] + " ");
                    x++;
                }
            }
        }
        System.out.println("\nIs the array b" + Arrays.toString(Arrays.copyOf(b, k)));
    }

    public static int returnCount(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                k += 1;
            }
        }
        return k;
    }
}


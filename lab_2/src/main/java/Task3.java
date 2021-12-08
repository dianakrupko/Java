/*19. Выведите на дисплей значения и индексы только тех элементов массива a,
значения которых не равны значениям других элементов, т.е. уникальных элементов массива.  */
import java.util.Arrays;
import java.util.Scanner;


public class Task3 {
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
        System.out.println("Is the array a" + Arrays.toString(a));
//        int k1=returncount(a);

        for (int j = 0; j <= n-1; j++)
        {
            int k=0;
            for (int i = 0; i < n; i++)
                if (a[i]==a[j])
                    k++;
            if (k==1)
                System.out.print("["+j+"]"+a[j]+"  ");
        }
    }
    public static int returncount(double [] arr) {
        int k = 0;
        for (int j = 0; j <= arr.length-1; j++) {
            for (int i = 0; i < arr.length; i++)
                if (arr[i] == arr[j]) k++;
        }
        return k;
    }
}




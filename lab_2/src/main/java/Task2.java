/*14. Проверьте, являются ли элементы int массива a множеством
(для этого среди элементов массива не должно быть двух элементов с одинаковым значением).*/

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
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

        System.out.println("Is the array a"+ Arrays.toString(a) +" a set? "+isVariety(a));
    }
    public static boolean isVariety(double[] data)
    {
        for(int i = 0; i < data.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(data[j] == data[i])
                    return false;
            }
        }
        return true;
    }
}




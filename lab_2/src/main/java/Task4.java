/*24. Определите номер дня в году по заданному номеру дня в месяце и номеру месяца. Признак,  является ли год високосным,
задается как булевская переменная.  Указание: количество дней до начала данного месяца
(не високосный год): январь 0, февраль – 31, март – 59, апрель – 90,
май –120, июнь – 151, июль – 181, август – 212, сентябрь – 243, октябрь – 273, ноябрь – 314,
декабрь – 334 задать в виде массива.  В високосном году, начиная с марта, к количеству дней добавляется 1.*/
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        int[] a = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 314, 334};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int m=sc.nextInt();
        System.out.println("Enter the day of the month: ");
        int d=sc.nextInt();
        System.out.println("A leap year? ");
        Scanner s=new Scanner(System.in);
        boolean lYear=s.nextBoolean();
        System.out.println("Day of the year:"+myday(m, d,a[m-1],lYear));
    }


    public static int myday(int month, int day,int arr,boolean leapYear){
        int yearsDay;
        if(leapYear && month>=3){
            yearsDay=arr+day+1;
        }
        else
            yearsDay= arr+day;
        return yearsDay;
    }
}


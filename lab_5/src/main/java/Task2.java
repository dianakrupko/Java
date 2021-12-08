import java.util.Scanner;
/**
 * Class that implements the program interface
 */
public class Task2 {
    /**Создать класс типа Прямоугольник. Поля - высота и ширина. Функции-члены вычисляют площадь, периметр,
     устанавливает поля и возвращают значения. Функции-члены установки
     полей класса должны проверять корректность задаваемых параметров.
     */
    /**
     * Function for interaction with the user
     *
     * @param args - string args
     */
    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle();
        Rectangle rectangle2=new Rectangle();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter height and width Rectangle1:");
        rectangle1.setHeight(scan.nextDouble());
        rectangle1.setWidth(scan.nextDouble());

        System.out.println("Enter height and width Rectangle2:");
        rectangle2.setHeight(scan.nextDouble());
        rectangle2.setWidth(scan.nextDouble());

        System.out.println(rectangle1+"\n"+rectangle2);
        System.out.println(rectangle1.hashCode()+"\n"+rectangle2.hashCode());
        System.out.println((rectangle1.equals(rectangle2)));
    }
}

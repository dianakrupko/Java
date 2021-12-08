import java.util.Scanner;
/**
 * Class that implements the program interface
 */
public class Task3 {
    /**Создать базовый класс – «окно» включающий координаты (left, top, right, bottom)
     и цвет окна, производный класс - «окно с текстом», включающий текст, цвет текста в окне.
     */
    /**
     * Function for interaction with the user
     *
     * @param args - string args
     */
    public static void main(String[] args) {
        Window window=new Window();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter left, top, right, bottom:");
        window.setLeft(scan.nextDouble());
        window.setTop(scan.nextDouble());
        window.setRight(scan.nextDouble());
        window.setBottom(scan.nextDouble());

        System.out.println("Enter colar window:");
        Scanner sc=new Scanner(System.in);
        String colarWind=sc.nextLine();
        window.setColorWindow(colarWind);

        System.out.println(window.hashCode());
        System.out.println((window.toString()));

        WindowWithText w1=new WindowWithText();
        System.out.println("Enter text and color text window1:");
        w1.setText(sc.nextLine());
        w1.setColarText(sc.nextLine());
        System.out.println(w1.toString());
        System.out.println(w1.hashCode());


        WindowWithText w2=new WindowWithText();
        System.out.println("Enter text and color text window2:");
        w2.setText(sc.nextLine());
        w2.setColarText(sc.nextLine());
        System.out.println(w2.toString());
        System.out.println(w2.hashCode());

        System.out.println(w1.equals(w2));
    }

}

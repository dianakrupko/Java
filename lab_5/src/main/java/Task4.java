import java.util.Scanner;
/**
 * Class that implements the program interface
 */
public class Task4 {
    /**Создать базовый класс – «окно» включающий координаты (left, top, right, bottom)
     и цвет окна, производный класс - «окно с текстом», включающий текст, цвет текста в окне.
     */
    /**
     * Function for interaction with the user
     *
     * @param args - string args
     */
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        System.out.println("Enter name mobile phone:");
        Scanner sc1 = new Scanner(System.in);
        mobilePhone.setName(sc1.nextLine());
        System.out.println("weight:");
        Scanner sc2 = new Scanner(System.in);
        mobilePhone.setWeight(sc2.nextDouble());
        System.out.println("screenDiagonal:");
        mobilePhone.setScreenDiagonal(sc2.nextDouble());
        System.out.println("built-in-memory:");
        Scanner sc3 = new Scanner(System.in);
        mobilePhone.setBuiltInMemory(sc3.nextInt());
        System.out.println("is camera:");
        Scanner sc4 = new Scanner(System.in);
        mobilePhone.setCamera(sc4.nextBoolean());

        System.out.println(mobilePhone.hashCode());
        System.out.println((mobilePhone.toString()));

        Smartphone smartphone1=new Smartphone();
        Smartphone smartphone2=new Smartphone();
        Scanner s=new Scanner(System.in);

        System.out.println("Enter processor frequency, number of cores, amount of RAM smartphone1:");
        smartphone1.setProcessorFrequency(s.nextInt());;
        smartphone1.setNumberOfCores(s.nextInt());
        smartphone1.setAmountOfRAM(s.nextInt());

        System.out.println(smartphone1.toString());
        System.out.println(smartphone1.hashCode());

        System.out.println("Enter processor frequency, number of cores, amount of RAM smartphone2:");
        smartphone2.setProcessorFrequency(s.nextInt());;
        smartphone2.setNumberOfCores(s.nextInt());
        smartphone2.setAmountOfRAM(s.nextInt());

        System.out.println(smartphone2.toString());
        System.out.println(smartphone2.hashCode());

        System.out.println(smartphone1.equals(smartphone2));

    }

}

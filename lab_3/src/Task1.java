import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("1- шифрування \n2- розшифрування");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        if (r == 1) {
            System.out.println("Введіть текст:");
            Scanner scanner1 = new Scanner(System.in);
            String s = scanner1.nextLine();
            System.out.println("Введіть ключ:");
            Scanner sc1 = new Scanner(System.in);
            int key = sc1.nextInt();
            System.out.println("Після шифрування: "+ Encryption(s, key));
        } else if (r == 2) {
            System.out.println("Введіть текст:");
            Scanner scanner2 = new Scanner(System.in);
            String s = scanner2.nextLine();
            System.out.println("Введіть ключ:");
            Scanner sc2 = new Scanner(System.in);
            int key = sc2.nextInt();
            System.out.println("Після розшифрування: "+ Decrypt(s, key));
        }
    }

    public static String Encryption(String str, int k) {
        String text = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'а' && c <= 'я')
            {
                c += k % 32;
                if (c < 'а')
                    c += 32;
                if (c > 'я')
                    c -= 32;
            }else if (c >= 'А' && c <= 'Я')
            {
                c += k % 32;
                if (c < 'А')
                    c += 32;
                if (c > 'Я')
                    c -= 32;
            }
            else if (c >= 'a' && c <= 'z')
            {
                c += k % 26;
                if (c < 'a')
                    c += 26;
                if (c > 'z')
                    c -= 26;
            }
            else if (c >= 'A' && c <= 'Z')
            {
                c += k % 26;
                if (c < 'A')
                    c += 26;
                if (c > 'Z')
                    c -= 26;
            }
            text += c;
        }
        return text;
    }

    public static String Decrypt(String str, int n) {
        int k = Integer.parseInt("-" + n);
        String text = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'а' && c <= 'я')
            {
                c += k % 32;
                if (c < 'а')
                    c += 32;
                if (c > 'я')
                    c -= 32;
            }else if (c >= 'А' && c <= 'Я')
            {
                c += k % 32;
                if (c < 'А')
                    c += 32;
                if (c > 'Я')
                    c -= 32;
            }
            else if (c >= 'a' && c <= 'z')
            {
                c += k % 26;
                if (c < 'a')
                    c += 26;
                if (c > 'z')
                    c -= 26;
            } else if (c >= 'A' && c <= 'Z')
            {
                c += k % 26;
                if (c < 'A')
                    c += 26;
                if (c > 'Z')
                    c -= 26;
            }
            text += c;
        }
        return text;
    }
}
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("String: ");
            String str = scan.nextLine();
            if (str.equals("-")) {
                System.exit(0);
            }
            CCharacter(str);
        }
    }

    public static String CCharacter(String str) {
        int[] counters = new int[(int) Character.MAX_VALUE + 1];
        for (char c : str.toCharArray()) {
            counters[(int) c]++;
        }

        for (int i = 0; i < counters.length; ++i) {
            if (counters[i] > 0)
                System.out.println((char) i + ": " + counters[i]);
        }
        return "Ok";
    }
}
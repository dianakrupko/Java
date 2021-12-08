import java.util.Scanner;
/**
 * Class that implements the program interface
 */
public class Task1 {
    /**Построить программу для работы с классом для хранения данных о сообщении
     на форуме (автор, тема, текст, время, дата создания и редактирование).
     Программа должна обеспечивать простейшие функции: ввод значений, редактирование, вывод значений.
     */
    /**
     * Function for interaction with the user
     *
     * @param args - string args
     */
    public static void main(String[] args) {
        Message message1 = new Message();
        Message message2 = new Message();
        Message m = new Message();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter author, topic, text, time, creationDate, editingDate message1:");

        message1.setAuthor(scan.nextLine());
        message1.setTopic(scan.nextLine());
        message1.setText(scan.nextLine());
        message1.setTimeCreation(scan.nextLine());
        message1.setCreationDate(scan.nextLine());
        message1.setEditingDate(scan.nextLine());

        System.out.println("Do you want to make changes? Enter 1 if \"yes\"");
        Scanner sc1 = new Scanner(System.in);
        int response1 = sc1.nextInt();
        if (response1 == 1) {
            changeData(message1);
        }

        System.out.println("Enter author, topic, text, time, creationDate, editingDate message2:");

        message2.setAuthor(scan.nextLine());
        message2.setTopic(scan.nextLine());
        message2.setText(scan.nextLine());
        message2.setTimeCreation(scan.nextLine());
        message2.setCreationDate(scan.nextLine());
        message2.setEditingDate(scan.nextLine());

        System.out.println("Do you want to make changes? Enter 1 if \"yes\"");
        Scanner sc2 = new Scanner(System.in);
        int response2 = sc2.nextInt();
        if (response2 == 1) {
            changeData(message1);
        }

        System.out.println(message1.toString());
        System.out.println("HashCode:" + message1.hashCode());

        System.out.println(message2.toString());
        System.out.println("HashCode:" + message2.hashCode());
        System.out.println(message1.equals(message2));


    }

    public static void changeData(Message m) {
        System.out.println("\nChoose something:\n\t1: Author\n\t2: Topik \n\t3: Text \n\t4:Time Creation\n\t5:CreatingDate\n\t6:EditingDate\n");
        Scanner s = new Scanner(System.in);
        int vidp = s.nextInt();
        Scanner scanner = new Scanner(System.in);
        switch (vidp) {
            case 1:
                System.out.println("Enter new author:");
                m.setAuthor(scanner.nextLine());
                break;
            case 2:
                System.out.println("Enter new topic:");
                m.setTopic(scanner.nextLine());
                break;
            case 3:
                System.out.println("Enter new text:");
                m.setText(scanner.nextLine());
                break;
            case 4:
                System.out.println("Enter new time:");
                m.setTimeCreation(scanner.nextLine());
                break;
            case 5:
                System.out.println("Enter new creationDate:");
                m.setCreationDate(scanner.nextLine());
                break;
            case 6:
                System.out.println("Enter new editingDate:");
                m.setEditingDate(scanner.nextLine());
                break;
            default:
                break;
        }
    }
}


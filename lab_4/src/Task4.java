/*Создайте приложение для поиска в списке файлов и удаления файла из списка.  Список (для 5 текстовых файлов с расширением .txt)
создается в программе и является объектом класса HashMap, где ключом является имя файла (типа String), а значением – объект типа TextFile,
содержащий два элемента String – абсолютный путь к файлу (без имени файла) и краткое описание содержимого файла.*/
import org.w3c.dom.Text;
import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        HashMap<String, TextFile> map
                = new HashMap<>();
        TextFile f1 = new TextFile("C:\\Users\\dnkru\\OneDrive\\Документи\\java", "Теоретичні відомості та завдання до лабораторної роботи №1.");
        TextFile f2 = new TextFile("C:\\Users\\dnkru\\OneDrive\\Документи\\java", "Теоретичні відомості та завдання до лабораторної роботи №2.");
        TextFile f3 = new TextFile("C:\\Users\\dnkru\\OneDrive\\Документи\\java", "Теоретичні відомості та завдання до лабораторної роботи №3.");
        TextFile f4 = new TextFile("C:\\Users\\dnkru\\OneDrive\\Документи\\java", "Теоретичні відомості та завдання до лабораторної роботи №4.");
        TextFile f5 = new TextFile("C:\\Users\\dnkru\\OneDrive\\Документи\\java", "Теоретичні відомості та завдання до лабораторної роботи №5.");
        map.put("file1.txt", f1);
        map.put("file2.txt", f2);
        map.put("file3.txt", f3);
        map.put("file4.txt", f4);
        map.put("file5.txt", f5);
        map.remove("file5.txt");
        map.remove("file2.txt");
        print_map(map);
        if (map.containsKey("file3.txt")) {

            TextFile a = map.get("file3.txt");

            System.out.println("Ключ file3.txt: \n"+a.toString());

        }
    }

    public static void print_map(Map<String, TextFile> map) {
        if (map.isEmpty()) {
            System.out.println("\nПусто.");
        } else {
            for (Map.Entry<String, TextFile> e : map.entrySet()) {
                System.out.println(e.getKey()+": " +e.getValue().toString());
            }
        }
    }
}


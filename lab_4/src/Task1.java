/*Создайте приложение для просмотра списка книг и удаления книг в  библиотечном каталоге.
Записи в списке (5 записей) являются объектами класса HashMap,
где ключом является индекс ISBN книги (типа Integer),
а значением – объект Book, содержащий наименование книги, фамилию, имя и отчество (ФИО) автора, издательство (все поля типа String),
год издания (типа int) и цену книги (типа float). Предусмотреть возможность сортировки книг по 2-3 полям.*/
import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer, Book> map_book
                = new HashMap<>();
        Book b1 = new Book("\"Кобзар\"", "Тарас Григорович Шевченко ", "\"Фішера\"", 1840, 1000.2f);
        Book b2 = new Book("\"Том Сойєр\"", "Марк Твен", "\"Знання\"", 2002, 300.5f);
        Book b3 = new Book("\"Лісова пісня\"", "Леся Українка", "\"Літера\"", 1999, 350.5f);
        Book b4 = new Book("\"Майстер і Маргарита\"", "Михайло Булгаков", "\"Літера\"", 2000, 320.5f);
        Book b5 = new Book("\"Стратегія геніїв\"", "Майкл Кузумано", "\"Клуб сімейного дозвілля\"", 2017, 500.5f);
        map_book.put(1, b1);
        map_book.put(2, b2);
        map_book.put(3, b3);
        map_book.put(4, b4);
        map_book.put(5, b5);
        map_book.remove(2);
        map_book.remove(3);


        print_map(map_book);

        System.out.println("\nРозмір: "
                + map_book.size());

        if (map_book.containsKey(2)) {

            Book a = map_book.get(2);

            System.out.println("За ключем 2: "+a.toString());

        }
        System.out.println("======================");

        List<Book> mapValues = new ArrayList<>(map_book.values());

        Collections.sort(mapValues, Comparator.comparing(Book::year));
        System.out.println("За роком видання:\n"+mapValues);

        Collections.sort(mapValues, Comparator.comparing(Book::price));
        System.out.println("За ціною:\n"+mapValues);

        Collections.sort(mapValues, Comparator.comparing(Book::author));
        System.out.println("За автором:\n"+mapValues);

    }
    public static void sorting(List<Book> list) {
    }

    public static void print_map(Map<Integer, Book> map_book) {
        if (map_book.isEmpty()) {
            System.out.println("\nПусто.");
        } else {
            for (Map.Entry<Integer, Book> e : map_book.entrySet()) {
                System.out.println(e.getKey()+": " +e.getValue().toString());
            }
        }
    }
}


/*Создайте приложение для выборки элемента из стека с приоритетами. Стек  (5 записей) создается в программе и
является объектом класса LinkedList. Запись в стеке является объектом StackMember, содержащим наименование программы (типа String),
объем памяти для программы в мегабайтах (типа int) и приоритет программы (типа int). Записи в стеке сортируются в соответствии с приоритетом.*/
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<StackMember> StackMemberList = new LinkedList<>();
        StackMember s1 = new StackMember("IntelliJ IDEA", 14, 1);
        StackMember s2 = new StackMember("RyCharm", 12, 5);
        StackMember s3 = new StackMember("VScode", 9, 2);
        StackMember s4 = new StackMember("Visual Sdudio", 10, 4);
        StackMember s5 = new StackMember("Notepad", 6, 3);
        StackMemberList.add(s1);
        StackMemberList.add(s2);
        StackMemberList.add(s3);
        StackMemberList.add(s4);
        StackMemberList.add(s5);
        System.out.println(StackMemberList);
        StackMember a = StackMemberList.get(2);
        System.out.println("Елемент за номером 2: " + a.toString());
        List<StackMember> memberList = new LinkedList<>(StackMemberList);
        Collections.sort(memberList, Comparator.comparing(StackMember::pr));
        System.out.println("За пріоритетом:\n" + memberList);
    }
}


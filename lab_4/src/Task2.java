/*Создайте приложение для поиска изображения в списке изображений.
Список (5 изображений) создается в программе и является объектом класса HashMap,
где ключом является наименование изображения (типа String), а значением – изображение.
Предусмотреть возможность чтобы изображения добавлялись с уникальными именами с помощью TreeSet.*/
import java.util.*;

public class Task2 {
    TreeSet<String> name_image =new TreeSet<>();
    public static void main(String[] args){
        HashMap<String, Image> map
                = new HashMap<>();
        Image p1=new Image("C:\\Users\\dnkru\\OneDrive\\Документи\\java\\im1");
        Image p2=new Image("C:\\Users\\dnkru\\OneDrive\\Документи\\java\\im2");
        Image p3=new Image("C:\\Users\\dnkru\\OneDrive\\Документи\\java\\im3");
        Image p4=new Image("C:\\Users\\dnkru\\OneDrive\\Документи\\java\\im4");
        Image p5=new Image("C:\\Users\\dnkru\\OneDrive\\Документи\\java\\im4");
        map.put("picture1.jpg", p1);
        map.put("picture2.jpg", p2);
        map.put("picture3.jpg", p3);
        map.put("picture4.jpg", p4);
        map.put("picture5.jpg", p5);
        print_map(map);
        if (map.containsKey("picture1.jpg")) {
            Image a = map.get("picture1.jpg");
            System.out.println("Picture1.jpg:\n\t" + a.toString());
        }

    }
    public void addImage(String mapKey){
        name_image.add(mapKey);

    }
    public boolean uniquenessName(String mapKey){
        return name_image.contains(mapKey);
    }

    public static void print_map(Map<String, Image> map) {
        if (map.isEmpty()) {
            System.out.println("\nПусто.");
        } else {
            for (Map.Entry<String, Image> e : map.entrySet()) {
                System.out.println(e.getKey()+": " +e.getValue().toString());
            }
        }
    }
}
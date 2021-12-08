import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;



public class GFG {

    public static void main(String[] args)

    {



        HashMap<Integer, String> map

                = new HashMap<>();



        print(map);

        map.put(11, "ss");

        map.put(22, "ff");

        map.put(33,"gg");



        System.out.println("Size of map is: "

                + map.size());



        print(map);

        if (map.containsKey(22)) {

            String a = map.get(22);

            System.out.println("value for key 22 is: " + a);

        }



        map.clear();

        print(map);

    }



    public static void print(Map<Integer, String> map)

    {

        if (map.isEmpty()) {

            System.out.println("map is empty");

        }



        else {

            System.out.println(map);

        }

    }

}
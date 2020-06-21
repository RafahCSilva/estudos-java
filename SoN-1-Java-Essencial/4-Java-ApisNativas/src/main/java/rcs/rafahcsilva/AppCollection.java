package rcs.rafahcsilva;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppCollection {
    public static void main(String[] args) {

        // Collections - ArrayList
        List<String> list = new ArrayList<String>();
        list.add(0, "A");
        list.add(1, "B");
        list.add(2, "C");
        System.out.println(list.toString());
        System.out.println(list.get(1));

        // Collections - HashMap
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "A");
        map.put(1, "B");
        map.put(2, "C");
        System.out.println(map.toString());
        System.out.println(map.get(0));

    }
}

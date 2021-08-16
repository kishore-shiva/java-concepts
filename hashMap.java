import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        //this hashmap has String key and integer value
        HashMap<String, Integer> map = new HashMap<>();
        //to add element in hashmap:
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        //to get element in hashmap:
        int a = map.get("one");
        //to get value from key:
        String b = map.getKey(1);
        //to remove element in hashmap:
        map.remove("one");
        //to update element in hashmap:
        map.put("one", 5);
        //to get size of hashmap:
        int size = map.size();
        //to print all elements in hashmap:
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

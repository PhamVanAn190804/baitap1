package Chuong4.map;
  

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide86 {
    public static void main(String[] args) {
        HashMap< String , String > hashMap = new HashMap<>();
        hashMap.put("CSlt","Co so lap trinh");
        hashMap.put("C++","C++");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java", "Java");

        Set<Map.Entry<String, String> setHashMap = hashMap.entrySet();
        System.out.println("cac entry trong SetHasMap: ");
        System.out.println(setHashMap);

    }
}

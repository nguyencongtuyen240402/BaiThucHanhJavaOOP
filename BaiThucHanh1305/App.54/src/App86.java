import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App86 {
    public static void name(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("CSDL","Co so lap trinh");
        hashMap.put("C++","C++");
        hashMap.put("C#","C Sharp");
        hashMap.put("PHP","PHP");
        hashMap.put("Java","Java");
        Set<Map.Entry<String,String>> setHashMap = hashMap.entrySet();
        System.out.println("Cac entry co trong setHashMap :");
        System.out.println(setHashMap);
    }
}

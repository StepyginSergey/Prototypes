import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String,Long> map = new HashMap<>();
        create(map);
        if(map != null) {
            for (Map.Entry<String, Long> e : map.entrySet()) {
                String key = e.getKey();
                Long value = e.getValue();
                System.out.println("key = " + key + " * value = " + value);
            }
        }
    }


    private static void create(Map<String,Long> map){
        System.out.println("method create");
        map = object();
        //map.put("sdhryht", 1L);
        System.out.println("---");
    }

    private static Map<String, Long> object(){
        System.out.println("method object");
        Map<String, Long> m  = new HashMap<>();
        m.put("Error", 12L);
        return m;
    }
}

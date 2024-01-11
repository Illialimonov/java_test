import java.util.HashMap;

public class Program {
    HashMap<String, String> hashmap;

    public Program(){
        this.hashmap = new HashMap<>();
    }

    public static void printKeys(HashMap<String,String> hashmap){
        for (String part : hashmap.keySet()) {
            System.out.println(part);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap2, String string) {
        for (String part : hashmap2.keySet()) {
            if (part.contains(string)){
                System.out.println(part);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap2, String string) {
        for (String part : hashmap2.keySet()) {
            if (hashmap2.get(part).contains(string)){
                System.out.println(hashmap2.get(part));
            }
        }
    }
}
    


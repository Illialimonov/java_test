import java.util.ArrayList;

public class SimpleCollection {
    ArrayList<String> collection;
    String longestString;

    public SimpleCollection() {
        collection = new ArrayList<>();
        // Check if the collection is not empty before trying to get the first element
        if (!collection.isEmpty()) {
            longestString = collection.get(0);
        }
    }

    public String longest() {
        for (String string : collection) {
            if (string.length() > longestString.length()) {
                longestString = string;
            }
        }
        return longestString;
    }

    public void add(String string) {
        collection.add(string);
    }
}
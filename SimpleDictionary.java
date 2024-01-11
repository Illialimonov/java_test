import java.util.ArrayList;

public class SimpleDictionary {
    private ArrayList<String> words;
    private ArrayList<String> translations;

    public SimpleDictionary() {
        this.words = new ArrayList<>();
        this.translations = new ArrayList<>();
    }

    public void addWord(String word, String translation) {
        words.add(word);
        translations.add(translation);
    }
    

    public String translate(String word) {
        try {
            int index = words.indexOf(word);
                return translations.get(index);
            }

        catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
}
}

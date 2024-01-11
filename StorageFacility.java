import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
private HashMap<String, ArrayList<String>> dict;

    public StorageFacility() {
        this.dict = new HashMap<>();
    }

    public void add(String word, String translation){
        this.dict.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> trans = this.dict.get(word);
        trans.add(translation);
    }
    public ArrayList<String> contents(String word){
        for (String lookedWord : dict.keySet()) {
            if (lookedWord.equals(word)){f
                return dict.get(lookedWord);
            }
        }
        return null;
    }

    public void remove(String word, String translation){
        for (String lookedWord : dict.keySet()) {
            if (lookedWord.equals(word)){
                dict.get(word).remove(translation);
                }
            }
        if (dict.get(word).size()==0){
                    dict.remove(word);
        }
        }
    

    public ArrayList<String> storageUnits() {
        ArrayList <String> names = new ArrayList<>();
        for (String lookedWord : dict.keySet()) {
            names.add(lookedWord);
        }
        return names;
    }

}





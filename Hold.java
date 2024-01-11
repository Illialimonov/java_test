import java.util.ArrayList;

public class Hold {
    int maxWeight;
    int counterSuit = 0;
    int totalWeight = 0;
    ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase adasCase) {
        counterSuit ++;
        totalWeight += adasCase.totalWeight();
        suitcases.add(adasCase);
    }

    public String toString(){
        return this.counterSuit + " suitcases " +  "(" + this.totalWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            ArrayList<Item> items = ((Object) suitcases).getItems();
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
    
}

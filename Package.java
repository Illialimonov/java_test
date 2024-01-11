import java.util.ArrayList;

public class Package {
    int total_weight = 0;
    ArrayList<Gift> gifts = new ArrayList<>();

    public Package(){
    }

    public void addGift(Gift gift){
        gifts.add(gift);
        total_weight+=gift.weight;
    }
    public int totalWeight(){
        return this.total_weight;
    }
    
}

public class Item {
    int weight;
    String name;
    
    public Item(String name, int weight){
        this.name = name;
        this.weight=weight;

    }

    public String getName(){
        return this.name;
    }
    public int getWeight(){
        return this.weight;
    }

    public String toString(){
        return this.name + " (" + this.weight + " kg)";
    }

}

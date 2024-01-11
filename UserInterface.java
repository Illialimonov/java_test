import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
    ArrayList<Integer> change = new ArrayList<>();
    change.add(1);
    change.add(2);
    change.add(3);
    
    change.set(1, 5);

    System.out.println(change.get(1));
    


    }
    
}

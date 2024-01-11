import java.util.ArrayList;
import java.util.Scanner;

public class BigYear {
    public static Scanner birdName;
    public static Scanner latinBirdName;
    public static Scanner command;
    public static Scanner searchedBirdName;

    public static void start(){
        command = new Scanner(System.in);
        birdName = new Scanner(System.in);
        searchedBirdName = new Scanner(System.in);
        latinBirdName = new Scanner(System.in);

        ArrayList<String> birds = new ArrayList<>();
        ArrayList<String> latin = new ArrayList<>();
        ArrayList<Integer> counter = new ArrayList<>();

        while (true){
            System.out.print("? - ");
            String input = command.nextLine();
            if (input.equals("add")){
                System.out.println();
                System.out.print("Name: ");
                String inputBird = birdName.nextLine();
                birds.add(inputBird);
                System.out.println();
                System.out.print("Name in Latin: ");
                String inputLatin = latinBirdName.nextLine();
                latin.add(inputLatin);
                counter.add(0);
            } else if (input.equals("observation")){
                System.out.print("Bird? ");
                input = command.nextLine();
                if (birds.contains(input)){
                    int index = birds.indexOf(input);
                    counter.set(index, counter.get(index)+1);
                } else {
                    System.out.println("Not a bird!");
                }
                dfdfsdgsdgfsdgsdgdsdfsdfsdf
            } else if (input.equals("all")) {
                System.out.println("");
                for (int i = 0; i < birds.size(); i++) {
                    System.out.println(birds.get(i) + " (" + latin.get(i) + "): " + counter.get(i) + " observations");
                }
                    
            } else if (input.equals("one")){
                System.out.println("Bird? ");
                String inputBird = birdName.nextLine();
                int index = birds.indexOf(inputBird);
                System.out.println(birds.get(index) + " (" + latin.get(index) + "): " + counter.get(index) + " observations");
            } else if (input.equals("quit")){
                break;
            }

        }
    }
}


// experimental branch 228



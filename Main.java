import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String numbersString = "1 2 3 4 5";
        
        // Split the string by spaces
        String[] numbersArray = numbersString.split(" ");

        int[] intArray = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            intArray[i] = Integer.parseInt(numbersArray[i]);
        }
       
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : intArray){
            list.add(i);
        }

        int smallest = list.get(0);
        for (Integer integer : list) {
            if (integer<smallest){
                smallest = integer;
            }
        }
        System.out.println(smallest);

        int biggest = list.get(0);
        for (Integer integer : list) {
            if (integer>biggest){
                biggest = integer;
            }
        }
        System.out.println(biggest);

        String finalAnswer= biggest + " " + "smallest";
        
    }
}
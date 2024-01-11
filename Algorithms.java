import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Algorithms {
    static Scanner s;

    public int smallest(int[] array) {
        int smallestDigit = array[0];
        for (int i : array) {
            if (i<smallestDigit){
                smallestDigit = i;
            }
        }
        return smallestDigit;
        
    }

    public int indexOfSmallest(int[] array){
        int smallestDigit = smallest(array);
        int index =0;
        for (int i : array) {
            if (!(i == smallestDigit)){
                index++;
            }
            return index;
        }
        return -1;
    }

    public int indexOfSmallestFrom(int[] numbers, int startIndex) {
        int smallestIndex = startIndex;
        for (int j = startIndex+1; j < numbers.length; j++) {
            if (numbers[j] < numbers[smallestIndex]) {
                smallestIndex = j;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        } else {
            System.out.println("Invalid indices provided. No swapping performed.");
        }
    }

    public void sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
                
            }
            
        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int linearSearch(int[] array, int searched) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searched) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] list, int searched) {
        
        int begin = 0;
        int last = list[list.length];

        while (begin <= last);
        int mid = (begin + last) / 2;
        if (list[mid] == searched){
            return mid;
        } else if (list[mid] < searched) {
            begin = mid + 1;
        } else if (list[mid] > searched) {
            last = mid - 1;
        }
        return -1;
    }

    public static void start(){
        s = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Integer> passPoints = new ArrayList<>();

        int input;
        System.out.println("Enter point totals, -1 stops: ");
        while (true){
            input = s.nextInt();
            if (input >=0 && input <=100){
                grades.add(input);
                if (input >=50 && input <=100){
                passPoints.add(input);}
            } else if (input == -1){
                break;
            }
        }
        System.out.println(calculateAvg(grades));
        System.out.println(calculateAvg(passPoints));
        System.out.println("Pass percentage: " + passPoints.size() / (passPoints.size() + grades.size()));
    }

    public static double calculateAvg(ArrayList<Integer> nums){
        int sum = 0;
        int counter = 0;
        for (int i : nums) {
            sum+=i;
            counter++;
        }
        return sum/counter;
    }
}
    
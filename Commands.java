import java.util.Scanner;

public class Commands {
    int amount;
    int amount1;
    int amount2;
    Scanner scan;
    String command;
    public Commands(){
        
    }


    public void start(){
        scan = new Scanner(System.in);

        while (true){
            System.out.println("First: " + amount1 +"/100");
            System.out.println("Second: " + amount2 +"/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount>=0) {
                if (amount+amount1>=100){
                    amount1=100;
                } else { amount1 += amount;}
                
            }
            if (command.equals("move") && amount>=0) {
                if (amount <= amount1) {
                    amount1 -= amount;
                    if (amount2 + amount > 100) {
                        amount2 = 100;
                    } else {
                        amount2 += amount;
                    }
                } else {
                    amount2 += amount1;
                    amount1 = 0;
                }
                
                
                

            }
            if (command.equals("remove") && amount>=0) {
                
            }
        }
    }
}

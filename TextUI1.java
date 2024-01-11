import java.util.Scanner;

public class TextUI1 {
    private Scanner scanner;
    private TodoList todo;

    public TextUI1(Scanner scanner, TodoList todo) {
        this.scanner = scanner;
        this.todo = todo;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                todo.add(task);
            } else if (command.equals("list")) {
                todo.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int indexRemoved = scanner.nextInt();
                todo.remove(indexRemoved);
             } else {
                System.out.println("Unknown command");
            }
        }
    }
}
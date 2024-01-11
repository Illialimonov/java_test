import java.util.ArrayList;

public class TodoList {
    public ArrayList<String> list;

    public TodoList() {
        list = new ArrayList<>();
    }
    public void add(String string) {
        list.add(string);
    }

    public void print() {
        for (String task : list) {
            System.out.println(list.indexOf(task) + 1 +": " + task) ;
        }
    }

    public void remove(int i) {
        list.remove(i-1);
    }
    
}

package useless_classes;
import java.util.ArrayList;

public class Room {
    ArrayList<Person> people;
    

    public Room () {
        people = new ArrayList<>();
    }
    
    

    public boolean isEmpty() {
        return people.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return people;
    }

    public void add(Person person) {
        people.add(person);
    }



    public Person shortest() {
        Person shortestPerson = people.get(0);
        for (Person person : people) {
            if(shortestPerson.getHeight() > person.getHeight()) {
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }

    
}

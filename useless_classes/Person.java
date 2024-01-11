package useless_classes;
public class Person {
        private String name;
        private int age;
        private int weight;
        private int height;
    

        public Person(String name, int height){
        this.name = name;
        this.height = height;
        // constructors and methods
        }

        @Override

        public String toString() {
            return  "Person{" +
            "name='" + name + '\'' +
            ", height=" + height +
            '}';
        }

        public int getHeight() {
            return this.height;
        }




    
        public boolean equals(Object compared) {
            // if the variables are located in the same position, they are equal
            if (this == compared) {
                return true;
            }
    
            // if the compared object is not of type Person, the objects are not equal
            if (!(compared instanceof Person)) {
                return false;
            }
    
            // convert the object into a Person object
            Person comparedPerson = (Person) compared;
    
            // if the values of the object variables are equal, the objects are equal
            if (this.name.equals(comparedPerson.name) &&
                this.age == comparedPerson.age &&
                this.weight == comparedPerson.weight &&
                this.height == comparedPerson.height) {
                return true;
            }
    
            // otherwise the objects are not equal
            return false;
        }
    
        // .. methods
    }

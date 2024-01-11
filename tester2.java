import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import useless_classes.SimpleDate;

public class tester2 {
    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility();
    facility.add("a14", "ice skates");
    facility.add("a14", "ice hockey stick");
    facility.add("a14", "ice skates");

    facility.add("f156", "rollerblades");
    facility.add("f156", "rollerblades");

    facility.add("g63", "six");
    facility.add("g63", "pi");

    facility.remove("f156", "rollerblades");

    System.out.println(facility.contents("f156"));

    facility.remove("f156", "rollerblades");

    System.out.println(facility.storageUnits());
    }
    
}

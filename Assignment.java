import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment {

    public static void main(String[] args) {

        // 1. Create an instance of an ArrayList of String called employeeNames.
        List<String> employeeNames = new ArrayList<String>();

        // 2. Create an instance of a HashSet of Integer called ids.
        Set<Integer> ids = new HashSet<Integer>();

        // 3. Create an instance of a HashMap of Integer, String called employeeMap.
        Map<Integer, String> employeeMap = new HashMap<Integer, String>();

        // 4. Add at least five entries to the employeeNames and ids (make sure both
        // collections have the same number of entries).
        employeeNames.add("Homer");
        employeeNames.add("Marge");
        employeeNames.add("Lisa");
        employeeNames.add("Bart");
        employeeNames.add("Maggie");
        
        System.out.println(employeeNames);

        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.add(5);

        System.out.println(ids);

    }
}
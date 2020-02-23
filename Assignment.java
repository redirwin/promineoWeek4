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
        
        // 5. Create a variable int i = 0; then interate over ids using an enhanced
        // for loop. Inside the enhanced for loop use employeeMap.put() to add a new
        // entry to the map. The entry should consist of a key that is the id in the 
        // enhanced for loop's current iteration, and a value that is the employeeName
        // at position i of the employeeNames ArrayList. Increment i so that each
        // iteration grabs the next element of the ArrayList.

        int i = 0;

        for (int id : ids) {
            employeeMap.put(id, employeeNames.get(i));
            i++;
        }

        // 6. Once the employeeMap is fully populated, use another enhanced for loop
        // to iterate over the employeeMap.keySet(), and use the key for each current
        // iteration to print to the console both the current key and its assciated
        // value in the map.

        for (Integer key : employeeMap.keySet()) {
            System.out.println(key + ": " + employeeMap.get(key));
        }
    }
}
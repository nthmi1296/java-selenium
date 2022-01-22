package L05;

import java.util.HashMap;
import java.util.Iterator;
import static java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {

    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "Police");
        emergencyList.put(114, "Fire Dept");
        emergencyList.put(115, "Hospital");
        emergencyList.put(null, "This is null");
        emergencyList.put(116, "Others");
        emergencyList.put(117, "Others");


        // CRUD
        String oneOneThree = emergencyList.get(113);
        System.out.println(oneOneThree);

        // Update

        emergencyList.replace(null, "NULL");
        emergencyList.replace(null, "New one", "NULL");
        System.out.println(emergencyList.get(null));

        // Remove
        emergencyList.remove(null, "null");
        emergencyList.remove(null);
        System.out.println(emergencyList.get(null));

        Set<Integer>  keySet = emergencyList.keySet();
//        for (Integer key : keySet) {
//            System.out.println(emergencyList.get(null));
//        }
        // Remove with key has Others value
//        for (Integer key : emergencyList.keySet()) {//emergencyList.keySet().for
//            if (emergencyList.get(key).equals("Others")){
//                emergencyList.remove(key);
//            }
//        }

        Iterator<Entry<Integer,String>> emergencyListIterator = emergencyList.entrySet().iterator();
        while (emergencyListIterator.hasNext()){
            Entry<Integer, String> entry = emergencyListIterator.next();
            String entryValue = entry.getValue();
            if (entryValue.equals("Others"))
                emergencyListIterator.remove();
        }

        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }
    }
}

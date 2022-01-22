package L06;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RandomClassMember {

    // One source OF truth | IN-memory storage
    // DRY - Don't Repeat Yourself
    private static Map<String, String> classMembers = new HashMap<>();
    private static Map<String, String> remainingMembers = new HashMap<>();
    private static Map<String, String> randomMembers = new HashMap<>();

    public static void main(String[] args) {
        classMembers.put("K5-001", "Tuan Pham Le");
        classMembers.put("K5-002", "Uyen Pham Thi Bich");
        classMembers.put("K5-003", "Yen Nguyen Thi");
        classMembers.put("K5-004", "Dieu Ai Le");
        classMembers.put("K5-005", "Nhu Le");
        classMembers.put("K5-006", "Quyen Dao Thuy");
        classMembers.put("K5-007", "Anh Nguyen Thi Van");
        classMembers.put("K5-008", "Bao Tran Dang");
        classMembers.put("K5-009", "Mi Nguyen");
        classMembers.put("K5-010", "Thanh Nguyen");
        classMembers.put("K5-011", "Phuong Vo Hong");
        classMembers.put("K5-012", "Hoang Tran Quoc");


        // Test missing members
//        updateMissingMember("K5-013");
        updateMissingMember("K5-011");

        // Assign remaining members
        resetRemainingMembers();

        // Pick randomly a member
        for (int i = 0; i < 100; i++) {
            pickRandomMember();
        }
    }

    public static void updateMissingMember(String studentKey) {
        if (classMembers.containsKey(studentKey)) {
            classMembers.remove(studentKey);
            System.out.println(classMembers);
        } else {
            System.out.println("No student with this ID: " + studentKey);
        }
    }

    public static void pickRandomMember(){
        if (remainingMembers.isEmpty()){
            resetRemainingMembers();
            resetRandomMembers();
        }

        // Pick randomly
        Set<String> allStudentKeys = remainingMembers.keySet();
        Object [] allStudentKeyArr = allStudentKeys.toArray();

        int remainingMemberNumber = allStudentKeyArr.length;
        int randomStudentKeyIndex = new SecureRandom().nextInt(remainingMemberNumber);
        String randomStudentKey = (String) allStudentKeyArr[randomStudentKeyIndex];
        String randomMemberName = remainingMembers.get(randomStudentKey);

        System.out.printf("We got: %s | %s\n", randomStudentKey, randomMemberName);

        //Update remaining list and random list
        remainingMembers.remove(randomStudentKey);
        randomMembers.put(randomStudentKey, randomMemberName);
    }

    private static void resetRandomMembers() {
        // Garbage collector
        randomMembers = new HashMap<>();
    }

    public static void resetRemainingMembers(){
        for (String studentKey : classMembers.keySet()) {
            remainingMembers.put(studentKey, classMembers.get(studentKey));
        }
    }

    /**
     * 1. Attendance
     * 2. currentClassMembers
     */
}

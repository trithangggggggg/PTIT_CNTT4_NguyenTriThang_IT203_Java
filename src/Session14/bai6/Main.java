package Session14.bai6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        patients.add(new Patient("Lan", 25, "Tim mạch"));
        patients.add(new Patient("Hùng", 30, "Nội tiết"));
        patients.add(new Patient("Mai", 28, "Tim mạch"));

        Map<String, List<Patient>> map = new HashMap<>();

        for (Patient p : patients) {
            String dept = p.getDepartment();
            if (!map.containsKey(dept)) {
                map.put(dept, new ArrayList<>());
            }
            map.get(dept).add(p);
        }

        for (String dept : map.keySet()) {
            System.out.println("Khoa " + dept + " -> " + map.get(dept));
        }

        String maxDept = "";
        int maxSize = 0;
        for (String dept : map.keySet()) {
            int size = map.get(dept).size();
            if (size > maxSize) {
                maxSize = size;
                maxDept = dept;
            }
        }
        System.out.println("Khoa " + maxDept + " đang đông nhất (" + maxSize + " bệnh nhân)");
    }
}
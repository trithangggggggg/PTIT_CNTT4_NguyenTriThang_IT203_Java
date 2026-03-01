package Session14.bai5;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Patient> queue = new TreeSet<>(
                Comparator.comparing((Patient p) -> p.getSeverity().getLevel())
                        .thenComparing(Patient::getArrivalTime)
        );

        queue.add(new Patient("Bệnh nhân A", Severity.MILD, 800));
        queue.add(new Patient("Bệnh nhân B", Severity.CRITICAL, 815));
        queue.add(new Patient("Bệnh nhân C", Severity.CRITICAL, 805));

        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}

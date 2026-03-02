package Session15.bai2;

public class Main {
    static void main(String[] args) {
        PatientQueue patientQueue = new PatientQueue();

        patientQueue.addPatient(new Patient("P01", "Nguyễn Văn A", 30));
        patientQueue.addPatient(new Patient("P02", "Trần Thị B", 25));
        patientQueue.addPatient(new Patient("P03", "Lê Văn C", 40));

        System.out.println();
        patientQueue.displayQueue();

        System.out.println();

        System.out.println("Bệnh nhân tiếp theo sẽ khám: "
                + patientQueue.peekNextPatient());

        System.out.println();
        patientQueue.callNextPatient();

        System.out.println();

        patientQueue.displayQueue();
    }
}


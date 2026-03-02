package Session15.bai4;

public class Main {
    static void main(String[] args) {
        EmergencyQueue eq = new EmergencyQueue();
        eq.addPatient(new EmergencyPatient("1","Tien",1));
        eq.addPatient(new EmergencyPatient("2","Thang",2));
        eq.addPatient(new EmergencyPatient("3","Huy",3));
        eq.disPlayQueue();
    }
}

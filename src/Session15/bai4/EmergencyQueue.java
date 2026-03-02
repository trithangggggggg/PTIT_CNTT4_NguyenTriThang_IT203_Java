package Session15.bai4;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {
    private Queue<EmergencyPatient> patients = new LinkedList<>();
    public void addPatient(EmergencyPatient ePt){
        patients.offer(ePt);
        System.out.println("Da them benh nhan: "+ ePt.getName());
    }
    public EmergencyPatient callNextPatient(){
        if(!patients.isEmpty()){
            EmergencyPatient ePt = patients.poll();
            System.out.println(ePt);
            return ePt;
        }else{
            System.out.println("Khong co benh nhan nao trong danh sach");
            return null;
        }
    }
    public void disPlayQueue() {
        for (EmergencyPatient ept : patients) {
            System.out.println(ept);
        }
    }
}

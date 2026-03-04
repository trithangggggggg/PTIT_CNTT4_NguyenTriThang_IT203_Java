package Session16.MiniPrj;

import java.util.LinkedList;
import java.util.Queue;


public class SpaService {
    private Queue<Pet> waitingQueue = new LinkedList<>();
    //tiep nhan thu
    public  void addToQueue(Pet pet){
        waitingQueue.offer(pet);
        System.out.println("Da them: "+ pet.getName());
        System.out.println("So luong dang cho: "+ waitingQueue.size());
    }
    // xu ly thu cung
    public void serveNext(){
        Pet currentPet = waitingQueue.poll();
        if(currentPet != null){
            System.out.println("Dang phuc vu");
            System.out.println(currentPet);
        }else{
            System.out.println("Khong co pet de phuc vu");
        }
    }
    //xem thu cung tiep theo khong xoa
    public void viewNext(){
        Pet nextPet = waitingQueue.peek();
        if(nextPet!= null){
            System.out.println("Thu cung tiep theo: ");
            System.out.println(nextPet);
        }else{
            System.out.println("Khong co thu cung nao dang cho");
        }
    }
    //  hien thi toan bo thu cung
    public void displayQueue(){
        if(waitingQueue.isEmpty()){
            System.out.println("Khong co thu cung nao dang cho");
            return;
        }
        for(Pet pet : waitingQueue){
            System.out.println(pet);
        }
    }

}
package Session16.MiniPrj;

public class PetManager extends GenericManager<Pet>{
    public void addPet(Pet pet){
        add(pet);
        System.out.println("Them pet thanh cong");
    }
    public void displayAll(){
        if (list.isEmpty()){
            System.out.println("Kho trong");
            return;
        }
        for (Pet pet: list){
            System.out.println(pet);
        }
    }
    public Pet findById(String id){
        for(Pet pet: list){
            if (pet.getId().equalsIgnoreCase(id)){
                return pet;
            }
        }
        return null;
    }
    public void removeById(String id){
        Pet pet = findById(id);
        if(pet != null){
            remove(pet);
            System.out.println("Da ban va xoa thu cung khoi kho");
        }else{
            System.out.println("Khong tim thay thu cung");
        }
    }

}

package Session16.MiniPrj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomerManager {
    private Map<String, Customer> customerMap = new HashMap<>();
    private Set<String> phoneSet = new HashSet<>();
    // dang ki thanh vien
    public void register(Customer customer){
        if(customerMap.containsKey(customer.getId())){
            System.out.println("Id khach hang da ton tai");
            return;
        }
        if(customerMap.containsKey(customer.getPhone())){
            System.out.println("Phone khach hang da ton tai");
            return ;

        }
        customerMap.put(customer.getId(), customer);
        phoneSet.add(customer.getPhone());
        System.out.println("Dang ki thanh cong");
    }
    // tra theo id
    public Customer findById(String id){
        return customerMap.get(id);
    }
    // hien thi khach hang
    public  void displayCustomer(){
        if (customerMap.isEmpty()){
            System.out.println("Khong co khach hang nao");
            return;
        }
        for(Customer customer: customerMap.values()){
            System.out.println(customer);
        }
    }
}
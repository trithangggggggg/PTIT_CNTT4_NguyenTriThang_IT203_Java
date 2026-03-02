package Session15.bai3;

import java.util.Stack;

public class StackMedicine {
    private Stack<Medicine> stack = new Stack<>();

    public void addMedicine(Medicine mc) {
        stack.push(mc);
        System.out.println("Da them thuoc: " + mc.getName());
    }

    public Medicine popMedicine() {
        if (stack.isEmpty()) {
            System.out.println("Khong co thuoc nao trong kho");
            return null;
        } else {
            Medicine mc = stack.pop();
            System.out.println(mc);
            return mc;
        }
    }

    public void reset() {
        stack.clear();
    }

    public void disPlayMedicine() {
        for (Medicine mc : stack) {
            System.out.println(mc);
        }
    }
}
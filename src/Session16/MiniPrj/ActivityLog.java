package Session16.MiniPrj;

import java.util.Stack;

public class ActivityLog {

    private Stack<String> actionStack = new Stack<>();

    public void logAction(String action) {
        actionStack.push(action);

        System.out.println("Đã ghi nhận thao tác: " + action);
    }



    public void undo() {
        if (!actionStack.isEmpty()) {
            String lastAction = actionStack.pop();

            System.out.println("Hoàn tác thao tác: " + lastAction);

        } else {
            System.out.println("Không có thao tác nào để hoàn tác.");
        }
    }


    public void viewRecent() {

        if (!actionStack.isEmpty()) {
            System.out.println("Thao tác gần nhất: " + actionStack.peek());
        } else {
            System.out.println("Chưa có thao tác nào.");
        }
    }


    public void displayAll() {
        if (actionStack.isEmpty()) {
            System.out.println("Nhật ký đang trống.");
            return;
        }

        System.out.println("Danh sách thao tác (mới nhất ở trên cùng):");
        for (int i = actionStack.size() - 1; i >= 0; i--) {
            System.out.println(actionStack.get(i));
        }
    }
}
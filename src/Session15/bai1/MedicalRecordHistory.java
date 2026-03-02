package Session15.bai1;

import java.util.Stack;

public class MedicalRecordHistory {
    Stack<EditAction> history = new Stack<>();

    public MedicalRecordHistory() {
        history = new Stack<>();
    }

    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Đã thêm hành động chỉnh sửa: " + action.getDescription());
    }

    public EditAction undoAction() {
        if (history.isEmpty()) {
            System.out.println("Không có hành động nào để hoàn tác.");
            return null;
        }
        EditAction lastAction = history.pop();
        System.out.println("Đã hoàn tác hành động: " + lastAction.getDescription());
        return lastAction;
    }

    public EditAction getLastEdit(){
        if (history.isEmpty()) {
            System.out.println("Không có hành động nào trong lịch sử.");
            return null;
        }
        return history.peek();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử chỉnh sửa trống.");
            return;
        }
        System.out.println("Lịch sử chỉnh sửa:");
        for (EditAction action : history) {
            System.out.println(action);
        }
    }
}

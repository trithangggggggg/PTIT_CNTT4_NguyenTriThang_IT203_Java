package HN_KS24_CNTT4_NguyenTriThang_05.bai3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 bieu thuc toan hoc muon kiem tra: ");
        String expression = sc.nextLine();

        if(expression == null || expression.isEmpty()) {
            System.out.println("Loi: Bieu thuc khong hop le");
            return;
        }

        String[] str = expression.split("");
        Stack<String> stack = new Stack<String>();

        boolean isValid = true;

        for (String s : str) {
            if (s.equals("(") || s.equals("[") || s.equals("{")) {
                stack.push(s);
            } else if (s.equals(")") || s.equals("]") || s.equals("}")) {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                String top = stack.pop();
                if ((s.equals(")") && !top.equals("(")) ||(s.equals("]") && !top.equals("[")) || (s.equals("}") && !top.equals("{"))) {
                    isValid = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            isValid = false;
        }
        if (isValid) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

import java.util.Stack;

public class AgricultureStack {
    public static void main(String[] args) {

        Stack<String> operations = new Stack<>();

        operations.push("Soil preparation completed");
        operations.push("Seeds planted");
        operations.push("Fertilizer applied");
        operations.push("Irrigation done");

        System.out.println(operations);

        System.out.println(operations.pop());

        System.out.println(operations.peek());

        System.out.println(operations);
    }
}

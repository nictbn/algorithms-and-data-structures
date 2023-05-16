import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private final LinkedList<Employee> stack;

    public LinkedStack() {
        this.stack = new LinkedList<>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }


    public void printStack() {
        for (Employee employee : stack) {
            System.out.println(employee);
        }
    }
}

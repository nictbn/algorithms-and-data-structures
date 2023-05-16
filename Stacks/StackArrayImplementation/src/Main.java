public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee(123,"Jane", "Jones"));
        stack.push(new Employee(456,"John", "Doe"));
        stack.push(new Employee(22,"Mary", "Smith"));
        stack.push(new Employee(3245,"Mike", "Wilson"));
        stack.push(new Employee(78, "Bill", "End"));

        stack.printStack();

        System.out.println("PEEK");
        System.out.println(stack.peek());
        System.out.println("END OF PEEK");
        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());
    }
}

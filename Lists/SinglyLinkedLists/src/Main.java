public class Main {
    public static void main(String[] args) {
        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(new Employee(123,"Jane", "Jones"));
        list.addToFront(new Employee(456,"John", "Doe"));
        list.addToFront(new Employee(22,"Mary", "Smith"));
        list.addToFront(new Employee(3245,"Mike", "Wilson"));
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }
}

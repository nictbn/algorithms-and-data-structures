public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee(123,"Jane", "Jones");
        Employee johnDoe = new Employee(456,"John", "Doe");
        Employee marySmith = new Employee(22,"Mary", "Smith");
        Employee mikeWilson = new Employee(3245,"Mike", "Wilson");

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee(78, "Bill", "End");
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());


        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());
    }
}

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee(123,"Jane", "Jones");
        Employee johnDoe = new Employee(456,"John", "Doe");
        Employee marySmith = new Employee(22,"Mary", "Smith");
        Employee mikeWilson = new Employee(3245,"Mike", "Wilson");

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        printList(list);

        Employee billEnd = new Employee(78, "Bill", "End");
        list.add(billEnd);
        printList(list);

        list.removeFirst();
        printList(list);

        list.removeLast();
        printList(list);
    }

    private static void printList(LinkedList<Employee> list) {
        System.out.print("HEAD -> ");
        for (Employee employee : list) {
            System.out.print(employee);
            System.out.print("<=>");
        }
        System.out.println("null");
    }
}

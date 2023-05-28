import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));

        Map<Integer, Employee> employeeMap = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();

        List<Employee> remove = new ArrayList<>();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employeeMap.containsKey(employee.getId())) {
                remove.add(employee);
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }

        for (Employee duplicate : remove) {
            employees.remove(duplicate);
        }

        System.out.println("***********************************");
        employees.forEach(e -> System.out.println(e));
    }
}

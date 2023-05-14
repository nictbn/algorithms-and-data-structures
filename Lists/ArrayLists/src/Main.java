import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(123,"Jane", "Jones"));
        employees.add(new Employee(456,"John", "Doe"));
        employees.add(new Employee(22,"Mary", "Smith"));
        employees.add(new Employee(3245,"Mike", "Wilson"));
        employees.forEach(System.out::println);
        System.out.println(employees.get(1));
        System.out.println(employees.isEmpty());
        employees.set(1, new Employee(3568, "John", "Adams"));
        employees.forEach(System.out::println);
        System.out.println(employees.size());
        employees.add(3, new Employee(456,"John", "Doe"));
        employees.forEach(System.out::println);

        System.out.println("to array");
        Employee[] employeeArray = employees.toArray(new Employee[employees.size()]);
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

        System.out.println(employees.contains(new Employee(22,"Mary", "Smith")));
        System.out.println(employees.indexOf(new Employee(456,"John", "Doe")));
        employees.remove(2);
        System.out.println("List after removal");
        employees.forEach(System.out::println);
    }
}

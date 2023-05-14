import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new Vector<>();
        employees.add(new Employee(123,"Jane", "Jones"));
        employees.add(new Employee(456,"John", "Doe"));
        employees.add(new Employee(22,"Mary", "Smith"));
        employees.add(new Employee(3245,"Mike", "Wilson"));
        employees.forEach(System.out::println);
    }
}

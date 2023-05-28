import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        Map<String, Employee> map = new HashMap<>();
        map.put("Jones", janeJones);
        map.put("Doe", johnDoe);
        map.put("Smith", marySmith);

        Iterator<Employee> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        map.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));

        System.out.println(map.containsKey("Doe"));
        System.out.println(map.containsValue(janeJones));

        Employee employee = map.putIfAbsent("Doe", mikeWilson);
        System.out.println(employee);
        System.out.println(map.get("Smith"));
        System.out.println(map.getOrDefault("Smith", mikeWilson));
        System.out.println(map.remove("Jones"));
        map.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));
    }
}

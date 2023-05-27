public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        CircularArrayQueue queue = new CircularArrayQueue(5);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.remove();
        queue.add(marySmith);
        queue.remove();
        queue.add(mikeWilson);
        queue.remove();
        queue.add(billEnd);
        queue.remove();
        queue.add(janeJones);

        queue.printQueue();
        System.out.println("End of circular testing");
        System.out.println();

        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);
        queue.printQueue();

        queue.remove();
        queue.remove();
        queue.printQueue();
        System.out.println(queue.peek());
        queue.printQueue();

        queue.remove();
        queue.remove();
        queue.remove();
        queue.printQueue();
        queue.add(mikeWilson);
        queue.printQueue();

    }
}

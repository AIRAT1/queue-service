public class Main {
    public static void main(String[] args) {
        QueueService queue = new QueueService();
        for (int i = 0; i < 10; i++) {
            queue.push(new Person(String.valueOf(i), i));
        }

        while (queue.size() > 0) {
            Person person = queue.pull();
            System.out.println("Name " + person.getName() + "; id " + person.getId());
            System.out.println("Queue size: " + queue.size());
        }
    }
}

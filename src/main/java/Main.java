public class Main {
    public static void main(String[] args) {
        QueueService queue = new QueueService();
        for (int i = 0; i < 10; i++) {
            queue.push(new Person("Name " + i));
        }

        while (queue.size() > 0) {
            Person person = queue.pull();
            System.out.println(person.getName());
            System.out.println("Queue size: " + queue.size());
        }
    }
}

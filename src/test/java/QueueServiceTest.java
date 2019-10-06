import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueServiceTest {
    @Test
    @DisplayName("Queue service test")
    void checkService() {
        QueueService service = new QueueService();
        service.pull();
        service.push(new Person("test_0", 0));
        service.pull();
        service.push(new Person("test_1", 1));
        service.push(new Person("test_2", 2));
        service.push(new Person("test_3", 3));
        service.pull();
        int size = service.size();
        assertEquals(2, size);
    }

    @Test@DisplayName("Check pull when size = 0")
    void checkPull() {
        QueueService service = new QueueService();
        assertEquals(null, service.pull());
    }

    @Test
    @DisplayName("Check if queue has 1 element")
    void checkIfQueueHasOneElement() {
        QueueService service = new QueueService();
        Person person = new Person("name", 0);
        service.push(person);
        assertEquals(person, service.pull());
        assertEquals(0, service.size());
    }

    @Test
    @DisplayName("Check if queue has 4 element")
    void checkIfQueueHasFourElements() {
        QueueService service = new QueueService();
        Person person0 = new Person("name", 0);
        Person person1 = new Person("name", 1);
        Person person2 = new Person("name", 2);
        Person person3 = new Person("name", 3);
        service.push(person0);
        service.push(person1);
        service.push(person2);
        service.push(person3);
        assertEquals(person0, service.pull());
        assertEquals(3, service.size());
    }
}
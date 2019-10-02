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
}
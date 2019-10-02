public class QueueService {
    private QueueElement head = null;
    private QueueElement tail = null;
    private int size = 0;

    public void push(Person person) {
        QueueElement element = new QueueElement();
        element.setPerson(person);
        if (head == null) {
            head = element;
        }else {
            tail.setNext(element);
        }
        tail = element;
        size++;
    }

    public Person pull () {
        if (size == 0) {
            return null;
        }
        Person person = head.getPerson();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return person;
    }

    public int size() {
        return size;
    }
}

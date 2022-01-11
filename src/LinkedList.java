public class LinkedList<T> {
    public LLNode<T> head;
    public int size;

    LinkedList() {
        size = 0;
    }

    LinkedList(T d) {
        head = new LLNode<T>(d);
        size = 1;
    }

    void insertAtEnd(T key) {
        if (head == null) {
            head = new LLNode<T>(key);
        } else {
            LLNode<T> i = head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = new LLNode<T>(key);
        }
        size++;
    }

    void deleteAtEnd() {
        if (head == null)
            return;
        else {
            LLNode<T> i = head;
            while (i.next.next != null)
                i = i.next;
            i.next = null;
        }
        size--;
    }


    void insertAtStart(T key) {
        LLNode<T> i = new LLNode<>(key);
        i.next = head;
        head = i;
        size++;
    }

    void deleteAtStart() {
        head = head.next;
        size--;
    }

    void deleteAt(int pos) {
        if (head == null)
            return;

        LLNode<T> i = head;
        while (pos-- > 0) {
            if (i == null) return;
            i = i.next;
        }
        i.next = i.next.next;
        size--;
    }

    void insertAt(int pos, T key) {
        LLNode<T> i = head;
        while (pos-- > 0) {
            if (i == null) return;
            i = i.next;
        }
        LLNode<T> temp = new LLNode<>(key);

        i.next = temp;
        temp.next = i.next.next;
    }

}

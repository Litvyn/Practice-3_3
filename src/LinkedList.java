import java.util.List;
//LinkedList
public class LinkedList<T> {
    class Node<T>{
        T element;
        Node<T> next;
        Node<T> previous ;

        public Node(T element) {
            this.element = element;
        }
        Node<T> head;
        Node<T> current;
        int countNodes;

        public void add(T element) {
            Node<T> newNode = new Node<>(element);
            if (head == null) {
                head = newNode;
            } else {
                current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
                newNode.previous = current;
            }

            countNodes++;
        }

        public void add(int index, T element) {
            Node<T> newNode = new Node<>(element);

            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                current = head;
                for (int i = 0; i < index - 1 && current != null; i++) {
                    current = current.next;
                }

                assert current != null;
                newNode.next = current.next;
                current.next = newNode;
                newNode.previous = current;
            }
            countNodes++;
        }

        public void addFirst(T e) {
            add(0, e);
        }

        public void addLast(T e) {
            add(size() - 1, e);
        }

        public T get(int index) {
            current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            assert current != null;

            return current.next.element;
        }

        public T getFirst() {
            return get(0);
        }

        public T getLast() {
            return get(size() - 1);
        }

        public T remove(int index) {
            if (index == 0) {
                head = head.next;
                current = head;
            } else {
                current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }

            countNodes--;

            return current.element;
        }

        public T removeFirst() {
            return remove(0);
        }

        public T removeLast() {
            return remove(size() - 1);
        }

        public void displayLinkedList() {
            Node<T> current = head;
            while (current != null) {
                System.out.print(current.element + " ");
                current = current.next;
            }
            System.out.println();
        }

        public void set(int index, T e) {
            remove(index);
            add(index, e);
        }

        public int indexOf(T e){
            int index = 0;
            current = head;

            for(int i = 0; i < size()-1; i++){
                if(current.element.equals(e)){
                    return index;
                }
                current = current.next;
            }

            return index;
        }

        public int size() {
            return countNodes;
        }


    }

}






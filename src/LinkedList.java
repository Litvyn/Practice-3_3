import java.util.List;
//LinkedList
public class LinkedList<T> {
   class Node<T>{
        T element;

        Node<T> next;


        public Node(T element) {
            this.element = element;
        }
        private Node<T> head;
        private Node<T> tail;
        private int size;
        private Node<T> current;

        public void add(T element) {
            Node<T> newNode = new Node<>(element);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;

            }

            size++;
        }

        public void add(int index, T element) {
            Objects.checkIndex(index,size);
            Node<T> newNode = new Node<>(element);
            if(head == null){
                head = tail = newNode;
            }else if (index == 0){
                newNode.next = head;
                head = newNode;
            }else if (index == size){
                tail.next = newNode;
                tail = newNode;
            }else {
                Node<T> current = head;
                for (int i = 0 ; i < index; i++){
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
            size ++;

        }

        public void addFirst(T e) {
            add(0,e);
        }

        public void addLast(T e) {
            add(size() - 1, e);
        }

        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }

            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            return head.element;
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
                if (head == null) {
                    tail = null;
                }
            } else {
                 current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
                if (current.next == null) {
                    tail = current;
                }
            }
            size--;
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
            return size;
        }


    }

}






import java.util.*;

class Node<T> {
    T data;
    Node<T> next;

    public Node (T data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString () {
        return data.toString();
    }
}

class List<T> {
    Node<T> head;

    public void insertFront (T data) {
        Node<T> temp = new Node<T>(data);
        if (head == null)
            head = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }

    public void insertRear (T data) {
        Node<T> temp = new Node<T>(data);
        if (head == null)
            head = temp;
        else {
            Node<T> curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = temp;
        }
    }

    public T deleteFront () {
        if (head == null)
            return null;
        T data = head.data;
        head = head.next;
        return data;
    }

    public T deleteRear () {
        if (head == null)
            return null;
        Node<T> temp = head;
        Node<T> tpre = head;
        while (temp.next != null) {
            tpre = temp;
            temp = temp.next;
        }
        T data = temp.data;
        tpre.next = null;
        return data;
    }

    @Override
    public String toString () {
        String str = "";
        Node<T> temp = head;
        while (temp.next != null) {
            str += temp.data + " -> ";
            temp = temp.next;
        }
        str += temp.data;
        return str;
    }

}

public class genList<T> {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> integerList = new List<>();
        List<Double> doubleList = new List<>();
        int ch = 0;
        do {
            System.out.print("1. integer list\n2. double list\nenter your choice: ");
            ch = sc.nextInt();
            int inp;
            do {
                System.out.print("1. insert front\n2. insert rear\n3. delete front\n4. delete rear\n5. display\nenter your choice: ");
                inp = sc.nextInt();

                if (inp == 1) {
                    System.out.print("enter item to be inserted: ");
                    if (ch == 1)
                        integerList.insertFront(sc.nextInt());
                    else if (ch == 2)
                        doubleList.insertFront(sc.nextDouble());
                }

                else if (inp == 2) {
                    System.out.print("enter item to be inserted: ");
                    if (ch == 1)
                        integerList.insertRear(sc.nextInt());
                    else if (ch == 2)
                        doubleList.insertRear(sc.nextDouble());
                }

                else if (inp == 3) {
                    Object item = null;
                    if (ch == 1)
                        item = integerList.deleteFront();
                    else if (ch == 2)
                        item = doubleList.deleteFront();
                    System.out.println("deleted item: " + item);
                }

                else if (inp == 4) {
                    Object item = null;
                    if (ch == 1)
                        item = integerList.deleteRear();
                    else if (ch == 2)
                        item = doubleList.deleteRear();
                    System.out.println("deleted item: " + item);
                }

                if (ch == 1)
                    System.out.println("integer list: " + integerList);
                else if (ch == 2)
                    System.out.println("double list: " + doubleList);

            } while (inp >= 1 && inp <= 4);
        } while (ch >= 1 && ch <= 3);
    }
}
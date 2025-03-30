import java.util.Scanner;

class LinkStack {

    int length;
    static final int mostLength = 10;
    Node first = new Node(null, null);

    class Node {
        Integer data;
        Node next;

        public Node(Integer data, Node next) {
            this.data = data;
            this.next = next;

        }

    }

    public boolean isEmpty() {
        if (length == 0) {
            return true;
        }
        return false;
    }

    public boolean push(int insertNum) {

        Node newInsert = new Node(insertNum, first.next);
        first.next = newInsert;
        length++;
        return true;
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        Node newInsert = first.next;
        first.next = newInsert.next;
        length--;
        return null;
    }

    public Integer popGet() {
        if (isEmpty()) {
            return null;
        }
        Node newInsert = first.next;
        first.next = newInsert.next;
        return newInsert.data;
    }

}

public class Linkstack {
    public static void main(String[] args) {
        LinkStack sLinkStack = new LinkStack();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int choice = sc.nextInt();
            if (choice == 1) {
                sLinkStack.push(sc.nextInt());
            }
            if (choice == 2) {
                if (sLinkStack.isEmpty() == true) {
                    System.out.println("Stack is Empty");
                }
                sLinkStack.pop();
            }
            if (choice == 3) {
                if (sLinkStack.isEmpty() == true) {
                    System.out.println("Stack is Empty");
                }
                int get = sLinkStack.popGet();
                System.out.println(get);
                break;

            }

        }

        sc.close();
    }
}
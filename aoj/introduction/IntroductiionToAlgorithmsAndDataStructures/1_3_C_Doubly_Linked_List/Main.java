import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        DoubleyLinkedList doubleyLinkedList = new DoubleyLinkedList();

        for (int i = 0; i < n; i++) {

            String[] line = br.readLine().split(" ");

            switch (line[0]) {

                case "insert" :
                    doubleyLinkedList.insert(Integer.parseInt(line[1]));
                    break;
                case "delete" :
                    doubleyLinkedList.delete(Integer.parseInt(line[1]));
                    break;
                case "deleteFirst" :
                    doubleyLinkedList.deleteFirst();
                    break;
                case "deleteLast" :
                    doubleyLinkedList.deleteLast();
                    break;

            }

        }

        System.out.println(doubleyLinkedList.toString());

    }

}

class Node {

    int key;
    Node next;
    Node prev;

    Node (int key) {
        this.key = key;
    }

}

class DoubleyLinkedList {

    private Node head;

    public DoubleyLinkedList() {

        head = new Node(-1);
        head.next = head;
        head.prev = head;

    }

    public void insert(int key) {

        Node node = new Node(key);
        node.next = head.next;
        node.prev = head;
        node.next.prev = node;
        head.next = node;

    }

    public void delete(int key) {

        Node node = head.next;

        while (true) {

            if (node == head) {
                break;
            }

            if (node.key == key) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                break;
            }

            node = node.next;

        }

    }

    public void deleteFirst() {

        Node node = head.next;
        node.next.prev = head;
        head.next = node.next;

    }

    public void deleteLast() {

        Node node = head.prev;
        node.prev.next = head;
        head.prev = node.prev;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        Node node = head.next;

        while (true) {

            if (node == head) {
                break;
            }

            sb.append(node.key + " ");

            node = node.next;

        }

        return sb.toString().trim();

    }

}

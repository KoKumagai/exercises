import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int quantum = sc.nextInt();

        MyQueue queue = new MyQueue();

        for (int i = 0; i < n; i++) {

            String name = sc.next();
            int time = sc.nextInt();
            Process process = new Process(name, time);
            queue.enqueue(process);

        }

        int totalTime = 0;

        while (!(queue.isEmpty())) {

            Process process = queue.dequeue();

            if (quantum < process.getTime()) {

                process.setTime(process.getTime() - quantum);
                queue.enqueue(process);
                totalTime += quantum;

            } else {

                totalTime += process.getTime();
                System.out.println(process.getName() + " " + totalTime);

            }

        }

    }

}

class Process {

    private String name;
    private int time;

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Process(String name, int time) {
        this.name = name;
        this.time = time;
    }

}

class MyQueue {

    private final int MAX_SIZE = 100000;
    private Process[] queue;
    private int head;
    private int tail;

    public MyQueue() {
        queue = new Process[MAX_SIZE];
        head = 0;
        tail = 0;
    }

    public void enqueue(Process process) {

        queue[tail] = process;

        if (tail + 1 == MAX_SIZE) {
            tail = 0;
        } else {
            tail++;
        }

    }

    public Process dequeue() {

        Process process = queue[head];

        if (head + 1 == MAX_SIZE) {
            head = 0;
        } else {
            head++;
        }

        return process;

    }

    public boolean isEmpty() {
        return head == tail;
    }

}

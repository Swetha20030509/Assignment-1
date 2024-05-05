package ThreadAssignment;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
    private static final int BUFFER_SIZE = 5;
    private static List<Integer> buffer = new ArrayList<>();

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            int item = 0;
            while (true) {
                synchronized (buffer) {
                    try {
                        while (buffer.size() == BUFFER_SIZE) {
                            System.out.println("Buffer is full. Producer is waiting...");
                            buffer.wait();
                        }
                        buffer.add(item);
                        System.out.println("Produced: " + item);
                        item++;
                        buffer.notify(); // Notify consumer that an item is produced
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000); // Simulate production time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (buffer) {
                    try {
                        while (buffer.isEmpty()) {
                            System.out.println("Buffer is empty. Consumer is waiting...");
                            buffer.wait();
                        }
                        int item = buffer.remove(0);
                        System.out.println("Consumed: " + item);
                        buffer.notify(); // Notify producer that an item is consumed
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(2000); // Simulate consumption time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


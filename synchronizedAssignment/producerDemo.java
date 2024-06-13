package synchronizedAssignment;

class Buffer {
    private Integer value = null;

    public synchronized void put(int newValue) {
        while (value != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value = newValue;
        System.out.println("Produced: " + newValue);
        notify();
    }

    public synchronized int get() {
        while (value == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int returnValue = value;
        value = null;
        System.out.println("Consumed: " + returnValue);
        notify();
        return returnValue;
    }
}


 class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.put(i);
            try {
                Thread.sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.get();
            try {
                Thread.sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}






public class producerDemo {
    int a;
    public static void main(String[] args) {
        int a=2;
        producerDemo p=new producerDemo();
        System.out.println(a);
        Buffer buffer = new Buffer();

        Thread producer1 = new Thread(new Producer(buffer), "Producer 1");
        Thread producer2 = new Thread(new Producer(buffer), "Producer 2");
        Thread consumer1 = new Thread(new Consumer(buffer), "Consumer 1");
        Thread consumer2 = new Thread(new Consumer(buffer), "Consumer 2");

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}

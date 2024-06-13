package synchronizedAssignment;

// ResourceA.java
class ResourceA {
    public synchronized void methodA(ResourceB b) {
        System.out.println(Thread.currentThread().getName() + " locked ResourceA");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " trying to lock ResourceB");
        synchronized (b) {
            System.out.println(Thread.currentThread().getName() + " locked ResourceB");
        }
    }
}

// ResourceB.java
class ResourceB {
    public synchronized void methodB(ResourceA a) {
        System.out.println(Thread.currentThread().getName() + " locked ResourceB");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " trying to lock ResourceA");
        synchronized (a) {
            System.out.println(Thread.currentThread().getName() + " locked ResourceA");
        }
    }
}

// Task1.java
class Task1 implements Runnable {
    private ResourceA a;
    private ResourceB b;

    public Task1(ResourceA a, ResourceB b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        a.methodA(b);
    }
}

// Task2.java
class Task2 implements Runnable {
    private ResourceA a;
    private ResourceB b;

    public Task2(ResourceA a, ResourceB b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        b.methodB(a);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        ResourceA a = new ResourceA();
        ResourceB b = new ResourceB();

        Thread thread1 = new Thread(new Task1(a, b), "Thread 1");
        Thread thread2 = new Thread(new Task2(a, b), "Thread 2");

        thread1.start();
        thread2.start();
    }
}


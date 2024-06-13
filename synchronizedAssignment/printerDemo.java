package synchronizedAssignment;
class Printer {
    public void printDocument(String documentName) {
        synchronized(this) {
            System.out.println(Thread.currentThread().getName() + " is printing document: " + documentName);
            // Simulate the time taken to print a document
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " has finished printing document: " + documentName);
        }
    }
}

// PrintJob.java
class PrintJob implements Runnable {
    private Printer printer;
    private String documentName;

    public PrintJob(Printer printer, String documentName) {
        this.printer = printer;
        this.documentName = documentName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            printer.printDocument(documentName + " " + (i + 1));
        }
    }
}

public class printerDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Create multiple threads
        Thread thread1 = new Thread(new PrintJob(printer, "Document1"));
        Thread thread2 = new Thread(new PrintJob(printer, "Document2"));
        Thread thread3 = new Thread(new PrintJob(printer, "Document3"));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

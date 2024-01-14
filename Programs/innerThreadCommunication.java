class SharedCounter {
    private int count = 0;

    // Increment the counter
    synchronized void increment() {
        count++;
        System.out.println("Incremented: " + count);
        notify(); // Notify waiting threads that the count has changed
    }

    // Decrement the counter
    synchronized void decrement() {
        while (count == 0) {
            try {
                wait(); // Wait if the count is already zero
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        count--;
        System.out.println("Decremented: " + count);
    }
}

public class innerThreadCommunication {
    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();

        // Create an increment thread
        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedCounter.increment();
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Create a decrement thread
        Thread decrementThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedCounter.decrement();
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Start both threads
        incrementThread.start();
        decrementThread.start();
    }
}

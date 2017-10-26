package chapter4.threads;

/**
 * Created by Solidbeans on 2017-01-16.
 */
public class SimpleThreads {

    public static void main(String args[]) throws InterruptedException {

        // Delay, in milliseconds before we interrupt MessageLoop thread .
        long patience = 1000 * 10;          // 10 sec

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());

        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");

        while (t.isAlive()) {
            threadMessage("Still waiting...");
            // Wait maximum of 1 second for MessageLoop thread to finish.

            t.join(1000);
            if ( ( (System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
                threadMessage("Tired of waiting!");
                t.interrupt();
                t.join();
            }
        }
        threadMessage("Finally!");
    }
    private static class MessageLoop implements Runnable {
        @Override
        public void run() {
            String importantInfo[] = {"Mares eat oats", "Does eat oats", "Little lambs eat ivy", "A kid will eat ivy too" };
            try {
                for (int i = 0; i < importantInfo.length; i++) {
                    // Pause for 4 seconds
                    Thread.sleep(1000);
                    // Print a message
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
        }
    }

    // Display a message
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }
}

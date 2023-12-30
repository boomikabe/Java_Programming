public class ThreadNameExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread-1");
        Thread t2 = new Thread(new MyRunnable(), "Thread-2");
        t1.start();
        t2.start();
        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());
    }
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread is running: " + Thread.currentThread().getName());
        }
    }
}
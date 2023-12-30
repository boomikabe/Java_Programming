import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        SharedPrinter printer = new SharedPrinter();
        Thread t1 = new Thread(new NumberPrinter(printer, 1, N / 2), "Thread-1");
        Thread t2 = new Thread(new NumberPrinter(printer, N / 2 + 1, N), "Thread-2");
        t1.start();
        t2.start();
        scanner.close();
    }
    static class SharedPrinter {
        private int number = 1;
        public void print(int num) {
            synchronized (this) {
                while (number <= num) {
                    while (number < num) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (number <= num) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                        notifyAll();
                    }
                }
            }
        }
    }
    static class NumberPrinter implements Runnable {
        private final SharedPrinter printer;
        private final int start;
        private final int end;
        public NumberPrinter(SharedPrinter printer, int start, int end) {
            this.printer = printer;
            this.start = start;
            this.end = end;
        }
        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                printer.print(i);
            }
        }
    }
}
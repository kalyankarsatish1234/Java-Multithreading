
//1.Performing single task from single thread
package case1;

public class Test extends Thread {
    public void run() {
        System.out.println("task 1");
    }

    public static void main(String[] args) {
        Test thread1 = new Test();
        thread1.start();
    }

}

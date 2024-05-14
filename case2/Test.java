////1.Performing single task from multiple thread

package case2;

public class Test extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Test thread1 = new Test();
        thread1.start();
        Test thread2 = new Test();
        thread2.start();
        /*
         * 
         * many thread creatd
         * only new thread created it execute not existing thread duble not created.
         */

    }

}

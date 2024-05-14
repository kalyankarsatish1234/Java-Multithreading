package case2;

 class MyThread1 extends Thread{
    public void run() {
        System.out.println("Thread 1");
        }
    
}
public class Test1 {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
         thread1.start();
         MyThread1 thread2 = new MyThread1();
        thread2.start();
        Test t1 = new Test();
        t1.start();
        /*
         * 
         * many thread creatd
         * only new thread created it execute not existing thread duble not created.
         */

    }
}

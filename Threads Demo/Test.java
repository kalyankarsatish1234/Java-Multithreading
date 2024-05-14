import java.lang.*;

public class Test extends Thread {
    public void run() {
        System.out.println("Thread task !");
    }

    public static void main(String[] args) {
        Test t = new Test();
        // t.run();// it is simple method not create thread

         t.start();//it create  thread and start not more than one
        // t.start() metod create otherwise show below error.
        // Exception in thread "main" java.lang.IllegalThreadStateException at
        // java.lang.Thread.start(Thread.java:705)
      


    }
}
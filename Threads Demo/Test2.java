
public class Test2 implements Runnable {
    // it is better way to creat threads
    @Override
    public void run() {
        System.out.println("thread task 2: ");
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        Thread th = new Thread(t);
        th.start();// it creates thread it implements Runnable interface at Thread class.
        // t.start()->it showing error,
        // t.run();//it not create thread it is a simple run method because it not
        // extend test thread class.

    }
}

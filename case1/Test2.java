package case1;
//1.Performing single task from single thread

class MyThread1 extends Thread{
    public void run(){
        System.out.println("Thread 1 is running");
    }
}
public class Test2 {
    public static void main(String[] args) {
        MyThread1  thread1 = new MyThread1();
        thread1.start();
    }
    
}

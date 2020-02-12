package Synchronized;

/**
 * Author: wangJianBo
 * Date: 2020/2/12 10:33
 * Content:
 */
public class Demo01Tick {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread.start();
        thread1.start();
        thread2.start();
    }
}

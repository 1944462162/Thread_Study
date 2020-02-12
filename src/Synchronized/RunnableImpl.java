package Synchronized;

/**
 * Author: wangJianBo
 * Date: 2020/2/12 10:34
 * Content:
 */


/**
 * 同步代码块方法：
 *      同步中的线程，没有执行完毕不会释放锁，同步外的线程没有锁进不去线程
 */
public class RunnableImpl implements Runnable{

    //定义一个多线程共享的票源
    private int tick = 100;

    //创建一个锁对象
    private final Object object = new Object();

    @Override
    public void run() {
     synchronized (object){
         while (tick > 0){
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println("正在出售第 " + tick + "张票");
             tick--;
         }
     }
    }
}

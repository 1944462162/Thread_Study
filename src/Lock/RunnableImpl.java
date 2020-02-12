package Lock;

/**
 * Author: wangJianBo
 * Date: 2020/2/12 10:34
 * Content:
 */


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Lock的方法步骤：
 *      1.在成员位置创建一个ReentrantLock()对象
 *      2.在可能出现线程安全性问题的代码前调用Lock接口中的方法lock锁
 *      3.在可能出现线程安全性问题的代码后调用Lock接口中的方法unlock锁
 */
public class RunnableImpl implements Runnable{

    //定义一个多线程共享的票源
    private int tick = 100;

    private Lock l = new ReentrantLock();

    @Override
    public void run() {


         while (true){

             l.lock();
             if (tick > 0){
                 try {
                     Thread.sleep(1);

                     System.out.println("正在出售第 " + tick + "张票");
                     tick--;
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 finally {
                     l.unlock();
                 }
             }

         }
    }
}

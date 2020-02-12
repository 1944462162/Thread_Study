package Thread;

/**
 * Author: wangJianBo
 * Date: 2020/2/11 9:56
 * Content:
 */

/**
 * sleep方法
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 60; i++) {
            System.out.println(getName() + "------" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

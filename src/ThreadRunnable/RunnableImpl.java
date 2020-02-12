package ThreadRunnable;

/**
 * Author: wangJianBo
 * Date: 2020/2/11 10:54
 * Content:
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "------" + i);
        }

    }
}

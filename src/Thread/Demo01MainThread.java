package Thread;

/**
 * Author: wangJianBo
 * Date: 2020/2/11 9:36
 * Content:
 */

/**
 * 主线程：执行主方法的线程
 *
 * 单线程：java程序中只有一个线程
 * 执行从main方法开始，从上到下依次执行
 *
 * jvm执行main方法，main方法会进入到栈内存
 * cpu就可以通过这个路径来执行main方法
 * 而这个路径有一个名字叫做main（主）线程
 */

/**
 * 创建多线程的第一种方法：创建Thread的子类
 * java.lang.Thread类：是描述线程的类，我们想要实现多现场程序，就必须继承Thread类
 *
 * 实现步骤：
 *      1.创建一个Thread类的子类
 *      2.在Thread类的子类中重写Thread类中的run方法，设置线程任务
 *      3.创建Thread类的子类对象
 *      4.调用Thread类中的start方法，开启新线程，执行run方法
 */

/**
 * 获取当前线程的名称 getName()
 * 获取当前执行的线程 Thread.currentThread()
 */

/**
 * 设置线程的名称（了解）
 * 1.通过setName 的方法设置
 * 2.带参数的构造方法
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("小强");
        myThread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "------" + i);
        }

    }
}

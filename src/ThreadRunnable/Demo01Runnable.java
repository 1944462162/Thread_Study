package ThreadRunnable;

/**
 * Author: wangJianBo
 * Date: 2020/2/11 10:48
 * Content:
 */

/**
 * 创建多线程的第二种方式：实现Runnable方法
 *
 * java.lang.Runnable
 *      Runnable 接口应该由那些打算指向其实例的类来实现。类必须定义一个成为run的无参数方法
 *
 *
 * 实现步骤：
 *      1.创建一个Runnable接口的实现类
 *      2.在实现类中重写Runnable的run方法，设置线程任务
 *      3.创建一个Runnable接口的实现类对象
 *      4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
 *      5.调用Thread类中的start方法，开启新线程指向run方法
 */


/**
 * 实现Runnable的好处
 *  1.避免了单继承的局限性：
 *      一个类只能继承一个类，类继承了Thread类就不能继承其他的类了
 *      实现了Runnable接口，还可以继承其他的类，实现了其他的接口
 *  2.增强了程序的扩展性，降低了程序间的耦合性
 *      实现Runnable接口的方式，把设置线程任务和开启线程任务进行了分离
 *      实现类中，重写run方法：用来设置线程任务
 *      创建Thread类对象，调用start方法：用来开启线程
 *
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-------" + i);
        }
    }
}

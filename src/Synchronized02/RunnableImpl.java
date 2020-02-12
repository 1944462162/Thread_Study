package Synchronized02;

/**
 * Author: wangJianBo
 * Date: 2020/2/12 10:34
 * Content:
 */


/**
 * 定义一个同步方法
 * 同步方法也会把方法内部的代码锁住
 * 只让一个线程执行
 * 同步方法的所对象是谁？
 * 也就是实现类对象 newRunnableImpl（）
 * 也就是this
 *
 */
public class RunnableImpl implements Runnable{

    //定义一个多线程共享的票源
    private static int tick = 100;


    @Override
    public void run() {
        payTick();
    }

    /**
     * 静态的同步方法
     * 所对象是谁？
     * 不能是this
     * this是创建对象之后产生的，静态方法优先于对象
     * 静态方法的锁对象是本类的class属性--》class文件对象（反射）
     */
    public synchronized static void payTickStatic(){
        while (tick > 0){
//            try {
////                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("正在出售第 " + tick + "张票");
            tick--;
        }
    }

    public synchronized void payTick(){
        while (tick > 0){
//            try {
////                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("正在出售第 " + tick + "张票");
            tick--;
        }
    }
}

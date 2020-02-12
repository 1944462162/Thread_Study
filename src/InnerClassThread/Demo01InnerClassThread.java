package InnerClassThread;

/**
 * Author: wangJianBo
 * Date: 2020/2/12 9:34
 * Content:
 */

/**'
 *  匿名内部类的方式创建线程
 *
 *  匿名内部类的作用：简化代码
 *      把子类继承父类，重写父类的方法，创建子类对象合一步完成
 *      把实现类实现类接口，重写接口中的方法，创建实现类对象合成一步完成
 */
public class Demo01InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        //new MyThread().start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }

            }
        }.start();

        //线程的接口Runnable

        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        };
        new Thread(runnable).start();
    }
}

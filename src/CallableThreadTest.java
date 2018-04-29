import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//1. 创建 Callable 接口的实现类，并实现 call() 方法，
// 该 call() 方法将作为线程执行体，并且有返回值。
public class CallableThreadTest implements Callable<Integer> {

    /**
     * 实现Callable接口，重写call()方法
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"" + i);
        }
        return i;
    }

    public static void main(String[] args) {
        //2. 创建 Callable 实现类的实例，使用 FutureTask 类来包装 Callable 对象，
        // 该 FutureTask 对象封装了该 Callable 对象的 call() 方法的返回值。
        CallableThreadTest callableThreadTest = new CallableThreadTest();
        FutureTask<Integer> futureTask = new FutureTask<>(callableThreadTest);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() +
                    "的循环变量i的值: " + i);
            if (i == 20){
                System.out.println("有返回值的线程：");
                new Thread(futureTask,"有返回值的线程").start();

            }

            try{
                System.out.println("子线程的返回值： "+futureTask.get());
            }catch (Exception e){
                e.printStackTrace();
            }
            
        }
        
    }
}

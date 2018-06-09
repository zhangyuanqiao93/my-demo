package proxy;

/**
 * Author: Bridge
 * Date: 2018/06/05 22:03
 * Function:Java反射反向代理实现类
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}

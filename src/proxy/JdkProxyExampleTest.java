package proxy;

/**
 * Java反向代理测试类
 */
public class JdkProxyExampleTest {
    public static void main(String[] args) {
        JdkProxyExample jdk  = new JdkProxyExample();
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());//绑定代理对象
        proxy.sayHello();//然后代理对象调度sayHello();
    }
}

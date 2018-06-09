package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author: Bridge
 * Date: 2018/06/05 22:05
 * Function:
 */
public class JdkProxyExample implements InvocationHandler {

    private Object target = null;

    /**
     * 建立代理对象和真实对象之间的关系，并且返回代理对象
     * @param target 真实对象
     * @return 代理对象
     */
    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }
    /**
     * \代理逻辑方法
     * @param proxy 代理对象，即bind()方法生成的对象
     * @param method 当前调度的方法
     * @param args 当前代理方法的参数
     * @return 代理结果返回
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理逻辑方法");
        System.out.println("在调度真实服务之前服务");

        Object object = method.invoke(target,args);
        System.out.println("在调度真实服务之后服务");
        return object;
    }


}

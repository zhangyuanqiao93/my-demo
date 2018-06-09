package proxy;

/**
 * Author: Bridge
 * Date: 2018/06/10 00:16
 * Function:
 */
public class testCGLIBProxy {
    public static void main(String[] args) {
        CglibProxyExample cpe = new CglibProxyExample();
        ReflectServiceImpl obj = (ReflectServiceImpl) cpe.getProxy(ReflectServiceImpl.class);
        obj.sayHello("张三");
    }

}

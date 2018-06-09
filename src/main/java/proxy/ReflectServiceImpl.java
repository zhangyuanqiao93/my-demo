package proxy;

/**
 * Author: Bridge
 * Date: 2018/06/10 00:11
 * Function:
 */
public class ReflectServiceImpl {
    public void sayHello(String name){
        System.out.println("Hello " + name);
    }

    public ReflectServiceImpl getInstance(){
        ReflectServiceImpl object = null;
        try {
            object = (ReflectServiceImpl) Class.forName("proxy.ReflectServiceImpl").newInstance();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}

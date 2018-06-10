package observable;

import java.util.Observable;
import java.util.Observer;

/**
 * Author: Bridge
 * Date: 2018/06/10 15:53
 * Function:
 */
public class JDObserver implements Observer {
    @Override
    public void update(Observable o, Object product) {
       String newProduct = (String) product;
        System.err.println("发送新产品" + newProduct + "同步到JD商城");

    }

    public static void main(String[] args) {
        ProductList observable = ProductList.getInstance();
        TBObserver tbObserver = new TBObserver();
        JDObserver jdObserver = new JDObserver();

        observable.addObserver(tbObserver);
        observable.addObserver(jdObserver);
        observable.addProduct("新增产品1");
    }
}

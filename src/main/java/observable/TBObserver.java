package observable;

import java.util.Observable;
import java.util.Observer;

/**
 * Author: Bridge
 * Date: 2018/06/10 15:55
 * Function:
 */
public class TBObserver implements Observer {
    @Override
    public void update(Observable o, Object product) {
        String newProduct = (String) product;
        System.err.println("发送新产品" + newProduct + "同步到TB商城");

    }
}

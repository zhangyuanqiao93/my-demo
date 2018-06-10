package observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Author: Bridge
 * Date: 2018/06/10 15:12
 * Function: 观察者模式实例
 */
public class ProductList extends Observable {
    private List<String> productList = null;//产品列表
    private static ProductList instance;//类的唯一实例
    private ProductList(){}

    /**
     * 获取唯一实例
     * @return 产品列表的唯一实例
     */
    public static ProductList getInstance(){
        if (instance == null){//单例模式
            instance = new ProductList();
            instance.productList = new ArrayList<String>();
        }
        return instance;
    }

    /**
     * 增加观察者（电商接口）
     * @param observer 观察者
     */
    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    /**
     * 新增产品
     * @param newProduct 新产品
     */
    public void addProduct(String newProduct){
        productList.add(newProduct);
        System.out.println("产品列表新增了： " + newProduct);
        this.setChanged();//观察者发生变化
        this.notifyObservers(newProduct);//通知观察者并传递新产品
    }
}

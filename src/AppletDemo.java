import java.applet.Applet;
import java.awt.*;

/**
 * @author Bridge
 */

/**
 * Applet 类可以有如下功能：
 * 1。得到Applet参数；
 * 2。打印浏览器状态信息；
 * 3。获取一张图片；
 * 4。获取一段音频；
 * 5。播放一段音频；
 */
public class AppletDemo extends Applet {

    /**
     *
     * @param graphics
     */
    public void paint(Graphics graphics){
        graphics.drawString("Hello Applet",25,50);
    }

    public static void main(String[] args) {
        AppletDemo demo = new AppletDemo();
        //demo.paint();
        System.out.println(AppletDemo.myTest());
    }

    public static int myTest(){

        String str = "Hello World, My Runoob.";
        int runoob = str.indexOf("Runoob");//返回
        System.out.println(runoob);
        return runoob;
    }
}

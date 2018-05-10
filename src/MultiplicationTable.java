/**
 * Author: Bridge
 * Date: 2018/05/04 16:59
 * Function: 九九乘法表
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j+"×" + i

                +"=" + j * i + "\t");//\t跳到下一个Tab
            }
            System.out.println();//空行
        }
    }

}

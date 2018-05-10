import java.util.StringTokenizer;

/**
 * Author: Bridge
 * Date: 2018/05/04 05:08
 * Function: 字符串的拼接
 * StringTokenizer分隔字符串
 */
public class StringSplitEMp {

    public static void main(String[] args){
        String str = "www-baidu-com";
        String[] temp;//临时String数组
        String delimiter = "-";//分隔符号来表示
        temp = str.split(delimiter);//临时数组缓存分隔后的字符串

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
            System.out.println(" ");
        }

        System.out.println("------java for each循环输出的方法-----");

        String str1 = "www.baidu.com";
        String s1 = str1.toUpperCase();//全部字符串转换为大写
        String s2 = s1.toLowerCase();
        String[] temp2;
        String delimiter2 = "\\.";//指定分隔符为.，需要进行转义
        temp2 = s2.split(delimiter2);
        for (String s:temp2
             ) {
            System.out.println(s);
            System.out.println("");
        }




        //默认的分隔符是：空格、制表符（\t）、换行符(\n）、回车符（\r）。
        String str3 = "Hello,my name is Bridge,Nice to meet you";
        StringTokenizer stringTokenizer = new StringTokenizer(str3);
//        System.out.println(stringTokenizer);
        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextElement());
        }

        StringTokenizer stringTokenizer1 = new StringTokenizer(str3,",");
        while (stringTokenizer1.hasMoreElements()){
            System.out.println(stringTokenizer1.nextElement());
        }
    }
}

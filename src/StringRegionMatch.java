/**
 * Author: Bridge
 * Date: 2018/05/04 15:46
 * Function:字符串区域比较
 */
public class StringRegionMatch {


    public static void main(String[] args) {
        String str1 = "Welcome to Microsoft";
        String str2 = "I work with microsoft";

        boolean aBoolean1 = str1
                .regionMatches(11,str2,12,9);
        //区分大小写比较，表示从第一个字符串的第11个位置即"M"开始，
        // 和第二个字符串的第12个位置开始，比较长度为9；


        boolean aBoolean2 = str1.regionMatches(true,11,str2,12,9);
        //不区分大小写,其他同上

        System.out.println(aBoolean1);
        System.out.println(aBoolean2);
    }

}

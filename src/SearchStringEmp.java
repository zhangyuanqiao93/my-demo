/**
 * Author: Bridge
 * Date: 2018/05/04 02:08
 * Function: 字符串查找
 */
public class SearchStringEmp {

    public static void main(String[] args) {
        String str = "Google Yahoo amazon";
        int index = str.indexOf("Yahoo");
        if (index == -1){
            System.out.println("不存在字符串");
        }else {
            System.out.println("Yahoo字符串的位置： " + index);
        }

    }
}

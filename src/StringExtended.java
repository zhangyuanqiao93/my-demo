/**
 * Author: Bridge
 * Date: 2018/05/04 16:20
 * Function:数组扩容
 */
public class StringExtended {

    public static void main(String[] args) {
        String[] names = new String[]{"A","B","C"};
        String[] extended = new String[5];
        extended[3] ="D";
        extended[4] ="E";

        System.arraycopy(names,0,extended,0,names.length);
        for (String str:extended
             ) {
            System.out.println(str);
        }
    }


}

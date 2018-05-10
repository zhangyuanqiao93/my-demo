import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Bridge
 * Date: 2018/05/04 16:43
 * Function:数组的并集
 */
public class StringUnion {

    /**
     * 两个数组的并集
     * @param arr1 数组1
     * @param arr2 数组2
     * @return 合并后的数组
     */
    public static String[] union(String[] arr1,String[] arr2){

        // 求两个字符串数组的并集，利用set的元素唯一性
        Set<String> set = new HashSet<>();

//        set.addAll(Arrays.asList(arr1));

        for (String str:arr1
                ) {
            set.add(str);
        }

        for (String str:arr2
                ) {
            set.add(str);
        }

        String[] result = {};

        return set.toArray(result);
    }

    public static void main(String[] args) {
        String[] arr1 = {"9","2","3"};
        String[] arr2 = {"4","5","6"};

        String[] union = union(arr1, arr2);
        for (String str:union
             ) {
            System.out.println("合并后的数组为： " + str);
        }

    }

}

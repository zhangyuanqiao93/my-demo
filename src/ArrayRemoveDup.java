import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author: Bridge
 * Date: 2018/05/04 16:27
 * Function:数组去重复元素
 */
public class ArrayRemoveDup {

    public static void main(String[] args) {
        int[] strings = {1,2,2,3,3,6,6,8,9};

        for (int i=0;i<strings.length-1;i++){
            for (int j = i+1; j < strings.length; j++) {
                if (strings[i] == strings[j] && i != j){
                    System.out.println("重复元素是：" + strings[j]);
                }
            }
        }


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.clear();//clear() function?
        //arrayList.clear():Removes all of the elements from this list
        arrayList.add(0,"第0个元素");
        arrayList.add(1,"第1个元素");
        arrayList.add(2,"第2个元素");
        arrayList.add(3,"第3个元素");

        System.out.println("删除前的元素" + arrayList);

        arrayList.remove(1);
        arrayList.remove("第3个元素");
        System.out.println("删除后的元素： " + arrayList);
    }
}

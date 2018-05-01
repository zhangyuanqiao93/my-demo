import java.lang.reflect.Array;
import java.util.*;

/**
 * Author: Bridge
 * Date: 2018/05/01 21:51
 * Function: java数组的排序和查找
 */
public class ArrayDemo {

    /**
     *
     * @param message 提示信息
     * @param arr 数组
     */
    private static void printMsg(String message, int[] arr){
        System.out.println(message + ": [length: " + arr.length + "]");//打印数组的长度
        //循环输出数组
        for (int i = 0; i < arr.length; i++) {
            if (i != 0){
                System.out.println(",");
            }

            System.out.println(arr[i]);
        }

        //System.out.println();
    }

    public static void main(String[] args){

        System.out.println("数组排序");

        int[] arr = {2,3,4,6,99,12,1,4,6,5,7};
        //不去重复
        Arrays.sort(arr);//Array数组的静态工具类，可以直接对数组进行排序
        System.out.println("打印排序后的数组");
        printMsg("排序后的数组是",arr);

        int index = Arrays.binarySearch(arr,12);
        int index1 = Arrays.binarySearch(arr,8);

        int newIndex1 = -index1 -1;

        int[] array = insertElement(arr,8,newIndex1);//将8这个元素插入到数组中去
        printMsg("将元素8添加到数组中",array);

        System.out.println("排序后的数组，8 的位置在第 " + index + " 个位置");
        //System.out.println("排序后的数组，8的位置在第 " + index1 + " 个位置");//负数表示不存在


        String[][] data = new String[5][2];
        System.out.println("二维数组的长度是：" + data.length);
        System.out.println("一维数组的长度是：" + data[0].length);


        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        arr1.add("D");
        arr1.add("E");


        System.out.println(arr1);
        Collections.reverse(arr1);
        System.out.println(arr1);


        String[] greeting = new String[3];
        greeting[0] = "教程";
        greeting[1] = "工具";
        greeting[2] = "笔记";

//        for (int i = 0; i < greeting.length; i++) {
//            System.out.println(greeting[i]);
//        }

        System.out.println("****************");
        for (String sGreeting: greeting
             ) {
            System.out.println(sGreeting);
        }


        Integer[] numbers = {4,5,2,9,3,1,7};
        System.out.println(Arrays.asList(numbers));
        int min = Collections.min(Arrays.asList(numbers));
        int max = Collections.max(Arrays.asList(numbers));

        System.out.println(min);
        System.out.println(max);

        System.out.println("数组的合并");
        String[] a = {"H","e","l","l","o"};
        String[] b = {"J","a","v","a","!"};

        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));


    }

    /**
     *
     * 往数组里添加一个元素
     * @param original 源数组
     * @param element 添加的元素
     * @param index 位置
     * @return 新的数组
     */
    private static int[] insertElement(int[] original, int element, int index){
        int length = original.length;
        int[] destination = new int[length+1];//新的数组
        System.arraycopy(original,0,destination,0,index);//Java浅拷贝

        destination[index] = element;//将元素插入到数组中
        System.arraycopy(original,index,destination,index+1,length-index);
        System.out.println(destination);
        return destination;
    }

}

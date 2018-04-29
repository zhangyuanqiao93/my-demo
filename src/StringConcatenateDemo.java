/**
 * @Author: Bridge
 * @Date: 2018/4/29
 */
public class StringConcatenateDemo {

    public static void main(String[] args) {
        System.out.println("----Main----");
        //1.创建程序的开始时间
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++) {
            String str = "This is" +
                    "testing the " +
                    "difference between" +
                    "String" +
                    "and" +
                    "StringBuffer";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("字符串连接--使用+字符： "+
                (endTime - startTime) + "ms");//0ms


        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("This is");
            stringBuffer.append("testing the");
            stringBuffer.append("difference between");
            stringBuffer.append("String and");
            stringBuffer.append("StringBuffer");
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println("使用StringBuffer创建字符串连接： "  +
                (endTime1 - startTime1)+ "ms");//6ms

    }
}

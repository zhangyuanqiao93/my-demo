public class StringComparePerformance {

    public static void main(String[] args) {
        long currentTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            String str1 = "Hello";
            String str2 = "Hello";
        }

        long endTime = System.nanoTime();
        System.out.println("通过String创建的字符串的时间是： "
        + (endTime-currentTime));


        long currentTime1 = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            String str1 = new String("Hello");
            String str2 = new String("Hello");
        }

        long endTime1 = System.nanoTime();
        System.out.println("通过String new 创建的字符串的时间是： "
                + (endTime1-currentTime1));

    }
}

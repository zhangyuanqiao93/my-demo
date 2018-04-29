import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        String str = "This is a String , split by StringTokenizer ,  created by runoob";
        StringTokenizer stringTokenizer = new StringTokenizer(str);

        System.out.println("------通过空格来切割字符串------");
        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextElement());
        }

        System.out.println("通过','来切割字符串");
        StringTokenizer stringTokenizer1 = new StringTokenizer(str,",");
        while(stringTokenizer1.hasMoreElements()){
            System.out.println(stringTokenizer1.nextElement());
        }
    }
}

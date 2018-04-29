/**
 * @author Bridge
 * @Date 2018/4/29
 * @function 比较equals()方法和"=="
 */
public class EqualDemo {

    public static void main(String[] args) {

        /**
         * 比较两个字符串，比较的原则：
         * 1。若两者是基本数据类型（原始数据类型：
         * byte,short,char,int,long,double,float,boolean），
         * 它们之间的比较应该是用"=="比较，则比较的是两者的值；
         * 2。复合类型：
         * 当复合数据类型用（==）进行比较，比较的是他们在内存中的存放地址；
         * 当复合数据类型之间进行equals比较时，这个方法的初始行为是比较对象在堆内存中的地址，
         * 但在一些诸如String,Integer,Date类中把Object中的这个方法覆盖了，
         * 作用被覆盖为比较内容是否相同。
         */
        String s1 = "Hello";
        String s2 = "Hello";

        if (s1 == s2){
            System.out.println("s1 == s2");
        }else {
            System.out.println("s1 != s2");
        }

        String s3 = "Hello";
        String s4 = new String("Hello");
        /**
         * 检查字符串池里是否存在"abc"这么一个字符串，
         * 如果存在，就返回池里的字符串；
         * 如果不存在，该方法会把"abc"添加到字符串池中，然后再返回它的引用。
         */
        s4 = s4.intern();//String 类的intern()方法
        if (s3 == s4){//比较的是两者的内存地址
            System.out.println("s3 == s4");
        }else{
            System.out.println("s3 != s4");
        }

        if (s3.equals(s4)){
            //String,Date,Integer等通过equals方法比较的是两者的值
            System.out.println("s3 equals s4");
        }else {
            System.out.println("s3 not equals s4");
        }


        /**
         * 深入理解JVM中的存储方法，存储区域以及基本数据类型和对象数据类型的本质
         */
        //String str6 = "SEUCalvin";//不添加此代码的时候输出为true，添加后两个输出均为false
        String str5 = new String("SEU") + new String("Calvin");
        System.out.println(str5.intern() == str5);//true
        System.out.println(str5 == "SEUCalvin");//true


        Integer i1 = 100,i2 = 100;
        Integer i3 = 10000,i4 = 10000;
        System.out.println(i1 == i2);//true
        System.out.println(i3 == i4);//false
    }
}

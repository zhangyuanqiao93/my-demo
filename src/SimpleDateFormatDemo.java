import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Author: Bridge
 * Date: 2018/04/30 18:52
 * Function: java 时间处理格式化
 */
public class SimpleDateFormatDemo {

    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-mm HH:mm:ss a";// 格式化时间，后面加a表示am，p表示pm
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strDateFormat);

        System.out.println("现在的时间是： " + simpleDateFormat.format(date));//已经格式化为24小时制的当前时间

        System.out.println("*******--获取当前的年月日--*********");

        //使用Calendar类获取当前的时间等;
        Calendar calendar = Calendar.getInstance();//单例模式
        int day = calendar.get(Calendar.DATE);//获取当前是日
        int month = calendar.get(Calendar.MONTH)+1;//获取当前月份0-11表示1-12月，记得在其后+1
        int year = calendar.get(Calendar.YEAR);//获取年份
        int dow = calendar.get(Calendar.DAY_OF_WEEK);//获取当前日期是一周的周几
        int dom = calendar.get(Calendar.DAY_OF_MONTH);//一个月的第几天
        int doy = calendar.get(Calendar.DAY_OF_YEAR);//一年的第几天


        System.out.println("当前的日期： " + day);
        System.out.println("当前的月份： " + month);
        System.out.println("当前的年份： " + year);
        System.out.println("当前是本周的星期： " + dow);
        System.out.println("当情是本月的第几天： " + dom);
        System.out.println("当前是本年的第几天： " + doy);


        System.out.println("*****--使用时间转换为时间戳--*****");

        //SimpleDateFormat 类的 format() 方法,使用时间转化为时间戳


        //1.获取当前时间戳
        Long timeStamp = System.currentTimeMillis();
        //2.使用SimpleDateFormat类的format()方法
        //在java.text.SimpleDateFormat包中
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String str = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        String str1 = sdf.format(new Date(timeStamp));
        System.out.println(str);
        System.out.println(str1);//不需要做类型转化


    }
}

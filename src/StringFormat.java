import java.util.Locale;

public class StringFormat {

    public static void main(String[] args) {
        double e = Math.E;//E = 2.71828
        System.out.format("%f%n",e);
        System.out.format(Locale.CHINA,"%-10.3f%n%n",e);
    }
}

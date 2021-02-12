package Question;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/*
    Locale(String Language);
                              Creates Locale from the given language code;

    Locale(String Language, String Country);
                              Creates Locale from the given language code & country code

    Locale(String Language, String Country, String variant);
                              Create Locale from the given language & country &variant code
 */
public class LocaleTest {

    public static void main(String[] args) {

        testDiffDateLocales();

        testAllLocales();
    }

    private static void testAllLocales() {
        Locale[] ls = Locale.getAvailableLocales();

        for (Locale locale:ls){
            System.out.println(locale + ",");
        }
    }

    private static void testDiffDateLocales() {

        Date date = new Date(2021, 2,11);

        Locale localeCN = Locale.SIMPLIFIED_CHINESE;

        Locale localeEN = new Locale("en", "US");

        String cn = DateFormat.getDateInstance(DateFormat.MEDIUM, localeCN).format(date);

        String en = DateFormat.getDateInstance(DateFormat.MEDIUM, localeEN).format(date);

        System.out.printf("cn=%s\nus=%s\n",cn,en);

    }
}

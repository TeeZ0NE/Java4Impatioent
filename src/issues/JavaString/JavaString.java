package issues.JavaString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaString {

    public static void main(String[] args) {
        String s = "   He is a very very good boy, isn't he?";
        String regex = "\\s*[ !,?._'@]+\\s*";
        s = s.trim();
        String[] result = s.split(regex);
        if (s.length() == 0){
            System.out.println("0");
        }
        else if (s.length() >=4_00_000){
            return;
        }
        else {
            System.out.println(result.length);
            for (String value : result) {
                System.out.println(value);
            }
        }

    }

}

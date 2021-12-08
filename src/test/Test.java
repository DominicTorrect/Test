package test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        String content = "2021-12-06";
        String rule = "^(\\d{4})\\-(\\d{2})\\-(\\d{2})$";
        Pattern pattern = Pattern.compile(rule);
        Matcher matcher = pattern.matcher(content);
        if(matcher.matches()){
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }

}

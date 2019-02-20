package com.stackroute.practice4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurences {
    public static String check(String str) {
        String regex = "se";
        String a="";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
             a+=matcher.start()+" "+matcher.end()+" ";
        }
        a=a.trim();
        return a;
    }
}

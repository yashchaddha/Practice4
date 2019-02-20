package com.stackroute.practice4;

import java.util.regex.Pattern;

public class Harry {
    public static boolean checkHarry(String str)
    {
         String regex = "Harry";
        boolean a=false;
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            a=true;
            break;
        }
        return a;
    }
}

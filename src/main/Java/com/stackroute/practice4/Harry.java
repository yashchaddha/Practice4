package com.stackroute.practice4;

import java.util.regex.Pattern;

public class Harry {
    public static boolean checkHarry(String str)
    {
        boolean b = Pattern.matches("\\bHarry\\b", str);
        return b;
    }
}

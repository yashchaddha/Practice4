package com.stackroute.practice4;

public class CountString {
    public static int count(String str)
    {
        int charcount = str.length() - str.replaceAll("a", "").length();
        return charcount;
    }
}

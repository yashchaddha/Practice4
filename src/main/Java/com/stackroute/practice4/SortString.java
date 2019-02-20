package com.stackroute.practice4;

public class SortString {
    public static String sortString(String s){
        String[] str=s.split(" ");
        for(int i=0; i<str.length; i++)
        {
            for(int j=1; j<str.length; j++)
            {
                if(str[j-1].compareTo(str[j])>0)
                {
                    String temp=str[j-1];
                    str[j-1]=str[j];
                    str[j]=temp;
                }
            }
        }
        String copy="";
        for(int i=0;i<str.length;i++)
        {
             copy=copy+str[i]+" ";
        }
        copy=copy.trim();
        return copy;
    }
}

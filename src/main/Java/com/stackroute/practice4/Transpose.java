package com.stackroute.practice4;

public class Transpose {
    public static String transpose(String str)
    {
        String[] arr=str.split(" ");
        String dummy="";
        for(int i=0;i<arr.length;i++)
        {
            String x=arr[i];
            for(int j=x.length()-1;j>=0;j--)
            {
                dummy=dummy+x.charAt(j);
            }
            arr[i]=dummy;
            dummy="";
        }
        dummy="";
        for(int i=0;i<arr.length;i++)
        {
            dummy=dummy+arr[i]+" ";
        }
        dummy=dummy.trim();
        return dummy;
    }
}

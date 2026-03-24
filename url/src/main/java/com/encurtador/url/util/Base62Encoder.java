package com.encurtador.url.util;

public class Base62Encoder {

    private static final String BASE62 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static String encode(long value){
        StringBuilder result = new StringBuilder();

        while (value > 0){
            int remainder = (int) (value % 62);
            result.append(BASE62.charAt(remainder));
            value = value / 62;
        }
        return result.reverse().toString();
    }


}

package com.iph;

import java.text.SimpleDateFormat;

public class H2CustomFunctions {
    public static String convertDatetimeToString(java.util.Date dttm, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(dttm);
    }
}
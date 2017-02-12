package Abbrevation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ${SzilviaB} on 2017. 01. 21..
 */

public class Abbrevation {

//    public String abbreviate(String string) {
//
//
//        String[] newStrings = string.split("\\W");
//
//        if (string.length() < 4 && string != null) {
//            return string;
//        }
//        StringBuilder stringFirst = new StringBuilder(newStrings[0]);
//        StringBuilder stringSecond = new StringBuilder(newStrings[1]);
//        replaceCharsInMiddle(stringFirst);
//        replaceCharsInMiddle(stringSecond);
//
//        return stringFirst.append("-").append(stringSecond).toString();
//    }
//
//    private void replaceCharsInMiddle(StringBuilder str) {
//        int count = 0;
//        for (int i = 1; i < str.length() - 1; i++) {
//            count++;
//        }
//        str.replace(1, str.length() - 1, Integer.toString(count));
//    }

    public String abbr(String string){
        StringBuilder rslt = new StringBuilder(string);
        String regex = "[A-Za-z]{4,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(string);
        while(m.find()){
            final String word = m.group();
            int start = m.start();
            int end = m.end();
            StringBuilder sb = new StringBuilder(word);
            int len = sb.length();
            sb.delete(1, len - 1);
            sb.insert(1, String.valueOf(len - 2));
            rslt.delete(start,end);
            rslt.insert(start,sb.toString());
            m = p.matcher(rslt.toString());
        }
        return rslt.toString();
    }

    public static String leo(final int oscar)
    {
        if(oscar == 88) {
            return  "Leo finally won the oscar! Leo is happy";
        }else if (oscar == 86){
            return "Not even for Wolf of wallstreet?!";
        }else if (oscar < 86){
            return "When will you give Leo an Oscar?";
        }
        return "Leo got one already!";
    }

}



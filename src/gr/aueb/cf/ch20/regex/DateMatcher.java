package gr.aueb.cf.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMatcher {
    public static void main(String[] args) {

        String date = "07/10/1998";     //mm/dd/yyyy

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(date);

        if (matcher.matches()){
//            Το group σκέτο ή group(0) είναι όλο το match
            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

            String grDate = day + "/" + month + "/" + year;
            System.out.println("GR Date: " +grDate);

        }
        else {
            System.out.println("Pattern not matches.");
        }

    }
}

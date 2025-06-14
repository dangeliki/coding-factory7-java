package gr.aueb.cf.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordAssertion {
    public static void main(String[] args) {

        String psswd = "AUEBa!!2025";

        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{8,}$");
        Matcher matcher = pattern.matcher(psswd);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

package com.example.quanlyvemaybay2.validators;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean isValidEmail(CharSequence email) {
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    public static boolean isValidateName(String name) {

        String regx = "^[\\p{L} .'-]+$";
        Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);
        return matcher.find();

    }

    public static boolean isValidPhoneNumber(CharSequence phoneNumber) {
        if (phoneNumber.length() != 10) {
            return false;
        } else {
            return (!TextUtils.isEmpty(phoneNumber) && Patterns.EMAIL_ADDRESS.matcher(phoneNumber).matches());
        }
    }
}

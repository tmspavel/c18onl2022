package com.tms.tasks.sixth.service;

public abstract class TextFormater {

    public static String[] splitByPoint(String string) {
        return string.split("\\. ");
    }

    public static boolean checkForFiveWordsInSentence(String[] strings) {
        return strings.length >= 3 && strings.length <= 5;
    }

    public static boolean checkPalindromeInSentence(String[] strings) {//массив слов
        // привет казак как дела
        for (String str : strings) {
            if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}

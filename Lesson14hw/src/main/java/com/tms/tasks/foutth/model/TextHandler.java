package com.tms.tasks.foutth.model;

import com.tms.tasks.sixth.service.TextFormater;

public class TextHandler {
    private String string;

    public TextHandler(String string) {
        this.string = string;
    }

    public String outPutSentences() {
        StringBuilder newString = new StringBuilder();
        for (String str : TextFormater.splitByPoint(string)) {
            String[] strings = string.split(" ");
            if (TextFormater.checkForFiveWordsInSentence(strings) || TextFormater.checkPalindromeInSentence(strings)) {
                newString.append(str).append(". ");
            }
        }
        return newString.toString();
    }
}

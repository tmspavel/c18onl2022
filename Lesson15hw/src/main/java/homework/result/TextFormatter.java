package homework.result;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public final class TextFormatter {
    private static final String WORD_REGEX = "[\\wа-яА-Я]+";
    private static final String SENTENCE_SPLIT_REGEX = "(?<=[?.!])\\s*";
    private static final String MID_WORD_HYPHEN = "(?<=[\\wа-яА-Я])-[$\\r\\n]+(?=[\\wа-яА-Я])";

    private TextFormatter() {
    }

    public static List<String> getSentencesFromText(String text) {
        List<String> originalSentences = Arrays.asList(text.split("[!.?]\\s*"));

        List<String> result = new ArrayList<>();
        Pattern midWordHyphen = Pattern.compile(MID_WORD_HYPHEN);
        for (String sentence : originalSentences) {
            String replacedSentence = sentence.replaceAll("-*\n+", "");
            result.add(replacedSentence);
//            Matcher mSentence = midWordHyphen.matcher(sentence);
//            result.add(mSentence.replaceAll(""));
        }
        return result;
    }

    public static int getCountWordsInString(String string) {
        return identifyWords(string).size();
    }

    public static List<String> getPalindromes(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (isPalindrome(string)) {
                result.add(string);
            }
        }
        return result;
//        return strings.stream()
//                .filter(TextFormatter::isPalindrome)
//                .collect(Collectors.toList());
    }

    public static boolean hasPalindromeInString(String string) {
        for (String word : identifyWords(string)) {
            if (isPalindrome(word)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasBlacklistWordInString(String string, String[] blacklist) {
        for (String blWord : blacklist) {
            if (string.contains(blWord)) {
                return true;
            }
        }
        return false;
    }

    private static List<String> identifyWords(String string) {
        return Arrays.asList(string.split(" "));

//        return Pattern.compile(WORD_REGEX).matcher(string)
//                .results()
//                .map(MatchResult::group)
//                .collect(Collectors.toList());
    }

    private static boolean isPalindrome(String string) {
        if (string.length() < 2) {
            return false;
        }
        StringBuilder sb = new StringBuilder(string);
        return string.equalsIgnoreCase(sb.reverse().toString());
    }
}

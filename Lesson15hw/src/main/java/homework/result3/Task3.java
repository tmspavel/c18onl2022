package homework.result3;

import homework.result.TextFormatter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static homework.result.TextFormatter.hasBlacklistWordInString;

/**
 * https://learn.javascript.ru/regexp-lookahead-lookbehind
 */
public class Task3 {
    private static final String BLACKLIST = "Lesson15hw/src/main/java/homework/result3/blacklist.txt";
    private static final String BLACKLIST_SEPARATOR = "[,\\s]+";
    private static final String TEXT = "Lesson15hw/src/main/java/homework/result3/text.txt";

    public static void main(String[] args) {
        try {
            String text = Files.readString(Path.of(TEXT));
            String[] blacklist = Files.readString(Path.of(BLACKLIST)).split(BLACKLIST_SEPARATOR);
            if (hasBlacklistWordInString(text, blacklist)) {
                System.out.println("В тексте обнаружены слова из чёрного списка." +
                        "\nПредложения, подлежащие исправлению:");
                List<String> sentences = TextFormatter.getSentencesFromText(text);
                int sentencesWithBLWords = 0;
                for (String sentence : sentences) {
                    if (hasBlacklistWordInString(sentence, blacklist)) {
                        System.out.println(sentence);
                        sentencesWithBLWords++;
                    }
                }
                System.out.println("Всего предложений, подлежащих исправлению: " + sentencesWithBLWords);
            } else {
                System.out.println("В тексте не встечаются слова из чёрного списка.");
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

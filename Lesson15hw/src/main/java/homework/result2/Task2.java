package homework.result2;

import homework.result.TextFormatter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private static final String INPUT_FILE = "Lesson12hw/src/main/java/homework/result2/input.txt";
    private static final String OUTPUT_FILE = "Lesson12hw/src/main/java/homework/result2/output.txt";

    public static void main(String[] args) throws IOException {
        String text = Files.readString(Path.of(INPUT_FILE));

        List<String> sentences = TextFormatter.getSentencesFromText(text);
        List<String> filteredSentences = new ArrayList<>();
        for (String sentence : sentences) {
            int numberOfWords = TextFormatter.getCountWordsInString(sentence);
            if (numberOfWords >= 3 && numberOfWords <= 5 || TextFormatter.hasPalindromeInString(sentence)) {
                filteredSentences.add(sentence);
            }
        }

        Files.write(Path.of(OUTPUT_FILE), filteredSentences);
    }
}

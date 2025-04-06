package ro.ulbs.paradigme.lab5.problema2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class RandomWordsGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int lines = 5;
        int wordsPerLine = 10;
        int wordLength = 4;

        try (FileWriter writer = new FileWriter("outrand.txt")) {
            for (int i = 0; i < lines; i++) {
                List<String> words = new ArrayList<>();
                for (int j = 0; j < wordsPerLine; j++) {
                    StringBuilder word = new StringBuilder();
                    for (int k = 0; k < wordLength; k++) {
                        char randomChar = (char) ('a' + random.nextInt(26));
                        word.append(randomChar);
                    }
                    words.add(word.toString());
                }
                Collections.sort(words); // ordonare crescătoare
                writer.write(String.join(" ", words) + "\n");
            }
            System.out.println("Fișierul outrand.txt a fost generat cu succes.");
        } catch (IOException e) {
            System.err.println("Eroare la scrierea fișierului: " + e.getMessage());
        }
    }
}

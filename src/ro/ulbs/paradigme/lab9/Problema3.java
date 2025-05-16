package ro.ulbs.paradigme.lab9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problema3 {
    public static void main(String[] args) {
        String text = "Acesta este un program scris cu java 8 si expresii lambda";
        List<String> list = Arrays.asList(text.split(" "));
        List<String> filtered = list.stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.toList());
        System.out.println("Lista cuvintelor cu lungime >= 5: " + filtered);
        List<String> sorted = filtered.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Lista ordonata: " + sorted);
        sorted.stream()
                .filter(word -> word.startsWith("p"))
                .findFirst()
                .ifPresent(word -> System.out.println("Primul cuvant care incepe cu 'p': " + word));
    }
}

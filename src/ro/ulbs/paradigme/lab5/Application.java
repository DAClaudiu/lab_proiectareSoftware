package ro.ulbs.paradigme.lab5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        try {
            Files.newBufferedWriter(Paths.get("out.txt") ,StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            printSmallTextFileCustom("in.txt","\n");
            System.out.println("\n\n");
            printSmallTextFileCustom("in.txt","\\.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    static void writeLargerTextFile(List<String> lines, String fileName) throws IOException {
        Path path = Paths.get(fileName);
        try (BufferedWriter writer = Files.newBufferedWriter(path,StandardOpenOption.CREATE, StandardOpenOption.APPEND)){
            for(String line : lines){
                writer.write(line);
                writer.newLine();
            }
        }
    }


    static void printSmallTextFileCustom(String fileName, String special ) throws IOException {
        System.out.println("Using Files.readAllLines:");
        Path path = Paths.get(fileName);
        List<String> allLinesInMemory = Files.readAllLines(path);
        List<String> finalFile = new ArrayList<>();
        for(String line: allLinesInMemory) {
            String[] arr=line.split(special);
            for(String word: arr) {
                System.out.println(": " +word);
                finalFile.add(": " + word);
            }
            System.out.println();
            finalFile.add("\n");
        }
        finalFile.add("\n\n");
        writeLargerTextFile(finalFile,"out.txt");
    }

    static void printLargerTextFile(String fileName) throws IOException {
        System.out.println("Using Scanner:");
        Path path = Paths.get(fileName);
        try (Scanner scanner = new Scanner(path)){
            while (scanner.hasNextLine()){
                System.out.println(": " + scanner.nextLine());
            }
        }
    }
}

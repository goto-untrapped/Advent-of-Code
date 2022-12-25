package day3.part2;

import day3.Rucksack;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final String PATH = "year2022/src/day3/part2/input.txt";

    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get(PATH);
        List<String> inputItems = Files.readAllLines(inputPath, StandardCharsets.UTF_8);

        List<List<String>> groupedItems = new ArrayList<>();
        for (int i = 0; i < inputItems.size(); i = i + 3) {
            List<String> oneGroupItems = new ArrayList<>(Arrays.asList(
                    inputItems.get(i), inputItems.get(i+1), inputItems.get(i+2)
                    ));
            groupedItems.add(oneGroupItems);
        }


        int total = 0;
        for (var items : groupedItems) {
            Rucksack rucksack = new Rucksack(items.get(0));
            String itemNeedCorrect = rucksack.getDuplication(items.get(0), items.get(1), items.get(2));
            total += rucksack.getPrioritizedScore(itemNeedCorrect);
        }

        System.out.println(total);
    }
}

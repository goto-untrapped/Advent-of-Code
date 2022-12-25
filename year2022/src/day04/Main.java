package day04;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final String PATH = "year2022/src/day04/input.txt";

    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get(PATH);
        List<String> inputLines = Files.readAllLines(inputPath, StandardCharsets.UTF_8);

        List<List<Integer>> list = new ArrayList<>();
        for (String line : inputLines) {
            List<Integer> elem = Arrays.stream(line.split("[,-]"))
                    .map(Integer::parseInt)
                    .toList();
            list.add(elem);
        }

        long countFullContain = solution1(list);
        System.out.println(countFullContain);

        long countContain = solution2(list);
        System.out.println(countContain);
    }

    private static long solution1(List<List<Integer>> list) {
        return list.stream()
                .filter(elem -> (elem.get(0) <= elem.get(2) && elem.get(3) <= elem.get(1))
                        ||
                        (elem.get(2) <= elem.get(0) && elem.get(1) <= elem.get(3)))
                .count();
    }

    private static long solution2(List<List<Integer>> list) {
        return list.stream()
                .filter(elem -> elem.get(2) <= elem.get(1) && elem.get(0) <= elem.get(3))
                .count();
    }


}

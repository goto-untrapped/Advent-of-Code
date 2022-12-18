package day2.part1;

import day2.part1.handshape.HandShape;
import day2.part1.handshape.Paper;
import day2.part1.handshape.Rock;
import day2.part1.handshape.Scissors;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Part1 {
    private static final String PATH = "year2022/src/day2/input.txt";

    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get(PATH);
        List<String> inputEncrypted = Files.readAllLines(inputPath, StandardCharsets.UTF_8);

        int sumScore = 0;
        HandShape handShape = null;
        for (String condition : inputEncrypted) {
            String myHandShape = condition.substring(2);
            String opponentHandShape = condition.substring(0, 1);

            if (myHandShape.equals("X")) {
                handShape = new Rock();
            }
            if (myHandShape.equals("Y")) {
                handShape = new Paper();
            }
            if (myHandShape.equals("Z")) {
                handShape = new Scissors();
            }

            assert handShape != null;
            sumScore += handShape.getSelfScore();
            sumScore += handShape.getOutcomeScore(opponentHandShape);
        }

        System.out.println(sumScore);

    }
}

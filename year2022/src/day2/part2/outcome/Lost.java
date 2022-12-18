package day2.part2.outcome;

import day2.part2.handshape.HandShape;
import day2.part2.handshape.Paper;
import day2.part2.handshape.Rock;
import day2.part2.handshape.Scissors;

public class Lost implements Outcome {

    HandShape handShape;

    @Override
    public int getOutcomeScore() {
        return 0;
    }

    @Override
    public int getShapeScore(String shapeStr) {
        if (shapeStr.equals("A")) {
            handShape = new Scissors();
        }
        if (shapeStr.equals("B")) {
            handShape = new Rock();
        }
        if (shapeStr.equals("C")) {
            handShape = new Paper();
        }

        return handShape.getSelfScore();
    }

}

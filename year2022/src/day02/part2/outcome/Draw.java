package day02.part2.outcome;

import day02.part2.handshape.HandShape;
import day02.part2.handshape.Paper;
import day02.part2.handshape.Rock;
import day02.part2.handshape.Scissors;

public class Draw implements Outcome {
    HandShape handShape;

    @Override
    public int getOutcomeScore() {
        return 3;
    }

    @Override
    public int getShapeScore(String shapeStr) {
        if (shapeStr.equals("A")) {
            handShape = new Rock();
        }
        if (shapeStr.equals("B")) {
            handShape = new Paper();
        }
        if (shapeStr.equals("C")) {
            handShape = new Scissors();
        }

        return handShape.getSelfScore();
    }

}

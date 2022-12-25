package day02.part2.outcome;

import day02.part2.handshape.HandShape;
import day02.part2.handshape.Paper;
import day02.part2.handshape.Rock;
import day02.part2.handshape.Scissors;

public class Won implements Outcome {

    HandShape handShape;

    @Override
    public int getOutcomeScore() {
        return 6;
    }

    @Override
    public int getShapeScore(String shapeStr) {
        if (shapeStr.equals("A")) {
            handShape = new Paper();
        }
        if (shapeStr.equals("B")) {
            handShape = new Scissors();
        }
        if (shapeStr.equals("C")) {
            handShape = new Rock();
        }

        return handShape.getSelfScore();
    }

}

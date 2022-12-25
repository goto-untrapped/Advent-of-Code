package day02.part1.handshape;

import day02.part1.outcome.Draw;
import day02.part1.outcome.Lost;
import day02.part1.outcome.Outcome;
import day02.part1.outcome.Won;

public class Scissors implements HandShape {
    Outcome outcome;

    @Override
    public int getSelfScore() {
        return 3;
    }

    @Override
    public int getOutcomeScore(String shapeStr) {
        if (shapeStr.equals("A")) {
            outcome = new Lost();
        }
        if (shapeStr.equals("B")) {
            outcome = new Won();
        }
        if (shapeStr.equals("C")) {
            outcome = new Draw();
        }

        return outcome.getOutcomeScore();
    }

}

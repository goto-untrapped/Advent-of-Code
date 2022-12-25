package day02.part1.handshape;

import day02.part1.outcome.Draw;
import day02.part1.outcome.Lost;
import day02.part1.outcome.Outcome;
import day02.part1.outcome.Won;

public class Rock implements HandShape {
    Outcome outcome;

    @Override
    public int getSelfScore() {
        return 1;
    }

    @Override
    public int getOutcomeScore(String shapeStr) {
        if (shapeStr.equals("A")) {
            outcome = new Draw();
        }
        if (shapeStr.equals("B")) {
            outcome = new Lost();
        }
        if (shapeStr.equals("C")) {
            outcome = new Won();
        }

        return outcome.getOutcomeScore();
    }

}

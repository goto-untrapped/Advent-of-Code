package day2.part1.handshape;

import day2.part1.outcome.Draw;
import day2.part1.outcome.Lost;
import day2.part1.outcome.Outcome;
import day2.part1.outcome.Won;

public class Paper implements HandShape {
    Outcome outcome;

    @Override
    public int getSelfScore() {
        return 2;
    }

    @Override
    public int getOutcomeScore(String shapeStr) {
        if (shapeStr.equals("A")) {
            outcome = new Won();
        }
        if (shapeStr.equals("B")) {
            outcome = new Draw();
        }
        if (shapeStr.equals("C")) {
            outcome = new Lost();
        }

        return outcome.getOutcomeScore();
    }

}

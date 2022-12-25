package day3.part1;

import java.util.Arrays;
import java.util.List;

public class Rucksack {
    private String items;
    private final String firstCompartment;
    private final String lastCompartment;
    private String itemNeedCorrect;
    private final Prioritize prioritize;

    public Rucksack(String items) {
        this.items = items;
        this.firstCompartment = items.substring(0, items.length() / 2);
        this.lastCompartment = items.substring(items.length() / 2);
        prioritize = new Prioritize();
    }
    public int getPrioritizedScore() {
        setItemNeedCorrect();
        if (this.itemNeedCorrect.matches("[A-Z]")) {
            return prioritize.getPriorityUpperCase(this.itemNeedCorrect);
        }
        if (this.itemNeedCorrect.matches("[a-z]")) {
            return prioritize.getPriorityLowerCase(this.itemNeedCorrect);
        }

        return Integer.MIN_VALUE;
    }

    private void setItemNeedCorrect() {
        this.itemNeedCorrect = Arrays.stream(firstCompartment.split(""))
                .filter(lastCompartment::contains)
                .toList()
                .get(0);
    }

}

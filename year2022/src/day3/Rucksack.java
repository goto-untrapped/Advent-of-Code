package day3;

import java.util.Arrays;

public class Rucksack {
    private final String items;
    private final Prioritize prioritize;

    public Rucksack(String items) {
        this.items = items;
        prioritize = new Prioritize();
    }

    public String getFirstCompartment() {
        return this.items.substring(0, this.items.length() / 2);
    }

    public String getLastCompartment() {
        return this.items.substring(this.items.length() / 2);
    }

    public int getPrioritizedScore(String strDuplication) {
        if (strDuplication.matches("[A-Z]")) {
            return prioritize.getPriorityUpperCase(strDuplication);
        }
        if (strDuplication.matches("[a-z]")) {
            return prioritize.getPriorityLowerCase(strDuplication);
        }

        return Integer.MIN_VALUE;
    }

    public String getDuplication(String firstCompartment, String lastCompartment) {
        return Arrays.stream(firstCompartment.split(""))
                .filter(lastCompartment::contains)
                .toList()
                .get(0);
    }

    public String getDuplication(String str1, String str2, String str3) {
        return Arrays.stream(str1.split(""))
                .filter(str2::contains)
                .filter(str3::contains)
                .toList()
                .get(0);
    }


}

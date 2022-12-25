package day3.part1;

public class Prioritize {
    private static final int OFFSET_LOWER_CASE = -96;
    private static final int OFFSET_UPPER_CASE = -38;

    public int getPriorityLowerCase(String oneLetter) {
        return oneLetter.chars().sum() + OFFSET_LOWER_CASE;
    }
    public int getPriorityUpperCase(String oneLetter) {
        return oneLetter.chars().sum() + OFFSET_UPPER_CASE;
    }
}

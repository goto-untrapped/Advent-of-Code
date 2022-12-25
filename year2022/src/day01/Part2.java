package day01;

import java.util.List;


public class Part2 {
    public static void main(String[] args) {
        Part1 part1 = new Part1();

        List<Integer> caloriesList = part1.getCaloriesList();
        int sumOfMaxThree = caloriesList.stream()
                .limit(3)
                .mapToInt(num -> num)
                .sum();

        System.out.println(sumOfMaxThree);

    }
}

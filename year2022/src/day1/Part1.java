package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Part1 {

    protected List<Integer> getCaloriesList() {
        List<Integer> caloriesList = new ArrayList<>();

        try (
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(System.in));
        ) {

            boolean isEOF = false;
            int sumCalories = 0;
            while (true) {
                String calories = bufferedReader.readLine();
                if (calories.isBlank() && isEOF) {
                    break;
                }

                isEOF = false;
                if (calories.isBlank()) {
                    caloriesList.add(sumCalories);
                    sumCalories = 0;
                    isEOF = true;
                    continue;
                }

                sumCalories += Integer.parseInt(calories);
            }

            caloriesList.sort(Comparator.reverseOrder());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return caloriesList;
    }

}

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.*;

public class Day15_RecalculateIngredients {

    /**
     * Mama przesłała Mikołajowi przepisy na ciasta. Blacha mamy Mikołaja jest prostokątna i ma wymiary 20cm x 30cm.
     * Mikołaj ma blachę okrągłą o średnicy 9.8 cm.
     * Pomóż Mikołajowi przeliczuć składniki przepisu na jego blaszkę.
     * Przygotuj funkcję, która będzie przyjmować 2 wymiary blaszki prostokątnej oraz średnicę okrąglej
     * i dla podanej listy składników dla prostokątnej przeliczy ich ilość dla okrągłej.
     * Dla uproszczenia nie przejmuj się jednostkami i załóż, że formy mają taką samą wysokość.
     */

    public static void main(String[] args) {

        Map<String, Integer> ingredientsForRectangleForm = Map.of(
                "Maka", 300,
                "Cukier", 100,
                "Jajka", 4,
                "Czekolada", 200,
                "Maslo", 200
        );

        double rectangleFormXDimension = 20;
        double rectangleFormYDimension = 30;

        double circleFormDiameter = 9.8;

        Map<String, String> ingredientsForCircleForm = recalculateIngredientsForCircleForm(
                ingredientsForRectangleForm,
                rectangleFormXDimension,
                rectangleFormYDimension,
                circleFormDiameter);

        System.out.println(ingredientsForCircleForm);
    }

    private static Map<String, String> recalculateIngredientsForCircleForm(Map<String, Integer> ingredients, double rectangleX, double rectangleY, double circleDiameter) {
        double rectangleArea = rectangleX * rectangleY;
        double radius = circleDiameter / 2;
        double circleArea = PI * radius * radius;

        Map<String, String> ingredientsForCircle = new HashMap<>();

        double ratio = circleArea / rectangleArea;
        DecimalFormat twoPlacesAfterDot = new DecimalFormat("#.#");

        for (Map.Entry<String, Integer> ingredientToAmount : ingredients.entrySet()) {
            double recalculatedIngredientAmount = ratio * ingredientToAmount.getValue();
            String formattedRecalculatedIngredientAmount = twoPlacesAfterDot.format(recalculatedIngredientAmount);
            ingredientsForCircle.put(ingredientToAmount.getKey(), formattedRecalculatedIngredientAmount);
        }

        return ingredientsForCircle;
    }
}
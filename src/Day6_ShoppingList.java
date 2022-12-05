import model.Recipe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Day6_ShoppingList {

    /**
     * Mikolaj postanowil przygotować w tym roku potrawy swiateczne samodzielnie.
     * Dostał od mamy listę przepisów, dzieki którym stworzy pyszne, tradycyjne potrawy!
     * Ale najpierw musi pójść na zakupy. Pomoż Mikołajowi i wygeneruj listę zakupów z listy przepisów.
     * Dla ułatwienia załóż, że wszystkie produkty są w tych samych jednostkach, wiec po prostu podlicz ilości.
     * P.S. Nie polecam używać tych przepisów, zostały one maksymalnie uproszone do celu zadania. :D
     */

    public static void main(String[] args) {
        List<Recipe> recipes = prepareRecipes();

        Map<String, Integer> shoppingList = new HashMap<>();

        // TODO: prepare shopping list for all recipes

        System.out.println(shoppingList);
    }

    private static List<Recipe> prepareRecipes() {
        return List.of(
                new Recipe(
                        "Murzynek",
                        Map.of(
                                "Maka", 300,
                                "Cukier", 100,
                                "Jajka", 3,
                                "Czekolada", 200,
                                "Maslo", 200
                        ),
                        "Piekarnik nagrzać do temp. 160 stopni [...]"),
                new Recipe(
                        "Piernik",
                        Map.of(
                                "Maka", 500,
                                "Cukier", 180,
                                "Miod", 250,
                                "Jajka", 1,
                                "Mleko", 80,
                                "Maslo", 150
                        ),
                        "Piekarnik nagrzać do temp. 180 stopni [...]"),
                new Recipe(
                        "Sernik",
                        Map.of(
                                "Maka", 100,
                                "Cukier", 200,
                                "Jajka", 6,
                                "Ser", 1000,
                                "Maslo", 200
                        ),
                        "Piekarnik nagrzać do temp. 160 stopni [...]"),
                new Recipe(
                        "Uszka",
                        Map.of(
                                "Maka", 300,
                                "Woda", 100,
                                "Jajka", 1,
                                "Sol", 1,
                                "Maslo", 200,
                                "Grzyby", 150,
                                "Cebula", 1
                        ),
                        "Zarobić ciasto z mąki, wody, soli i jajka [...]"),
                new Recipe(
                        "Barszcz",
                        Map.of(
                                "Buraki", 1000,
                                "Bulion", 1500,
                                "Zakwas", 200,
                                "Sol", 1
                        ),
                        "Buraki rozdrobnić i zagotować z bulionem [...]"),
                new Recipe(
                        "Pierogi",
                        Map.of(
                                "Maka", 300,
                                "Woda", 100,
                                "Jajka", 1,
                                "Kapusta", 500,
                                "Grzyby", 50,
                                "Cebula", 1
                        ),
                        "Zarobić ciasto z mąki, wody, soli i jajka [...]"),
                new Recipe(
                        "Karp",
                        Map.of(
                                "Karp", 1000,
                                "Maka", 50,
                                "Mleko", 500,
                                "Sol", 1,
                                "Olej", 500
                        ),
                        "Rybę umyć i pokroić w dzwonki [...]")
        );
    }
}
import java.util.ArrayList;
import java.util.List;

public class Day13_RevertNames {

    /**
     * Chochliki nie ułatwiają życia Mikołajowi. Tym razem poodwracały imiona dzieci na liście…
     * Napraw co popsuły chochliki i odwróć imiona.
     * Zwróć uwagę na duże litery i zamień je, tak, żeby imiona były poprawne.
     * Na koniec wypisz listę w terminalu żeby sprawdzić, czy wszystko jest ok!
     */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Uisaj");
        names.add("Aisak");
        names.add("Aisa");
        names.add("Kemot");
        names.add("Lahcim");

        // Simplest, step by step version with loop
        for (int i = 0; i < names.size(); i++) {
            String correctName = reverseStringStepByStep(names.get(i));
            names.set(i, correctName);
        }
        System.out.println(names);

        // Shorter version with StringBuilder methods
        // names.replaceAll(Day13_RevertNames::reverseStringUsingStringBuilder);
    }

    private static String reverseStringUsingStringBuilder(String string) {
        String reversedLowercase = new StringBuilder(string).reverse().toString().toLowerCase();
        return reversedLowercase.substring(0, 1).toUpperCase() + reversedLowercase.substring(1);
    }

    private static String reverseStringStepByStep(String string) {
        String stringInLowercase = string.toLowerCase();
        StringBuilder reversedString = new StringBuilder();

        for (int i = stringInLowercase.length() - 1; i >= 0; i--) {
            reversedString.append(stringInLowercase.charAt(i));
        }

        String firstLetterUppercase = string.substring(string.length() - 1).toUpperCase();

        reversedString.replace(0, 1, firstLetterUppercase);

        return reversedString.toString();
    }
}
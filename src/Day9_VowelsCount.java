import model.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day9_VowelsCount {

    /**
     * Mikołaj wykupił pakiet wysyłkowy do prezentów, ale przyoszczędził na wersji premium.
     * Przez to będzie musiał dopłacić 2 zł za każdą samogłoskę w adresie.
     * Pomóż Mikołajowi i policz ile będzie musiał dopłacić, a policzoną wartość wypisz na ekranie.
     * Adresy znajdziesz w przygotowanej liście, nie ma w nich polskich znaków.
     */

    public static void main(String[] args) {
        List<Address> addresses = prepareAddresses();
        int vowelsCount = 0;

        for (Address address : addresses) {
            vowelsCount += countVowelsStepByStep(address.getCity());
            vowelsCount += countVowelsStepByStep(address.getStreet());
            vowelsCount += countVowelsStepByStep(address.getNumber());
        }

        // FIXME: You can also use shorter version with IntStream or Regex. Check methods below.
        // FIXME: You can also use shorter version with regex. Check getVowelsShortVersion method below.

        int pricePerVowel = 2;
        System.out.println("Santa needs to pay: " + vowelsCount * pricePerVowel + "zl");
    }

    private static int countVowelsStepByStep(String string) {

        int vowelCount = 0;
        List<Character> vowels = List.of('a', 'e', 'y', 'i', 'o', 'u');
        String stringLowercase = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            if (vowels.contains(stringLowercase.charAt(i))) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    private static long countVowelsUsingIntStream(String string) {
        List<Character> vowels = List.of('a', 'e', 'y', 'i', 'o', 'u');

        return string.toLowerCase()
                .chars()
                .filter(ch -> vowels.contains((char) ch))
                .count();
    }

    public static long countVowelsUsingRegex(String string) {
        Pattern pattern = Pattern.compile("[aeiouy]");
        Matcher matcher = pattern.matcher(string.toLowerCase());
        return matcher.results().count();
    }

    private static List<Address> prepareAddresses() {
        List<Address> addresses = new ArrayList<>();

        addresses.add(new Address("Serniczkowa",
                "4B",
                2,
                "Krakow",
                "02-326"
        ));
        addresses.add(new Address("Pierniczkowa",
                "289A",
                55,
                "Gdansk",
                "02-326"
        ));
        addresses.add(new Address("Barszczykowa",
                "234",
                5,
                "Rzeszow",
                "37-326"
        ));
        addresses.add(new Address("Uszkowa",
                "43H",
                5,
                "Wroclaw",
                "02-326"
        ));
        addresses.add(new Address("Cukierkowa",
                "23I",
                5,
                "Poznan",
                "02-326"
        ));

        return addresses;
    }
}
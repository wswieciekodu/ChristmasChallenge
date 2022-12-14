public class Day14_SplitPresentsList {

    /**
     * Lista prezentów od dzieci przychodzi w jednym długim napisie.
     * Napis zawiera dane w formacie: imię dziecka, spacja, prezenty rozdzielone spacjami, przecinek.
     * Pomóż Mikołajowi! Podziel napis na ciągi: imię dziecka => prezenty po przecinku.
     * Po ostatnim prezencie w linii nie powinno byc przecinka.
     */

    public static void main(String[] args) {

        String giftsList = "Kuba klocki klawiatura dron quad, Alicja komputer samochod mysz, "
                + "Janina ksiazka traktor, Tomek kuchenka koparka flamastry, ";

        String[] splitBySpace = giftsList.split(" ");

        splitGiftsStringStepByStep(splitBySpace);
        splitGiftsStringUsingRegex(giftsList);
    }

    private static void splitGiftsStringStepByStep(String[] splitBySpace) {
        System.out.println("Split string with gifts step by step:");
        for (String string : splitBySpace) {
            if (string.contains(",")) {
                System.out.print(string.substring(0, string.length() - 1));
                System.out.println();
            } else if (Character.isUpperCase(string.charAt(0))) {
                System.out.print(string + " => ");
            } else {
                System.out.print(string + ",");
            }
        }
    }

    private static void splitGiftsStringUsingRegex(String giftsList) {
        System.out.println("\nSplit string with gifts one line using regex:");
        String formatted = giftsList.replaceAll(", ", "\n")
                .replaceAll("[A-Z][a-z]*", "$0 =>")
                .replaceAll("\\b(?!>)\s(?!=)", ",");
        System.out.println(formatted);
    }
}
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Day4_PresentToZeroOnes {

    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii
     * i zamiast rozwozić wszystkie prezenty, niektóre przesłać przez Internet.
     * Do tego celu musi zamienić nazwy prezentów w strumienie bitów!
     * Pomoż Mikołajowi! Przygotuj kod, który zamieni nazwy prezentów na ciąg zer i jedynek.
     * Dla każdej litery nazwy prezentu znajdz kod UTF-8, a później zamień go na system binarny.
     * Dla każdego prezentu wypisz na ekran ciąg zer i jedynek. Każdy prezent w oddzielnej linijce.
     * Możesz napisać funkcję zamieniającą numer znaku na system binarny samodzielnie,
     * albo znaleźć odpowiednią funkcję w bibliotece Twojego języka.
     */

    public static void main(String[] args) {

        List<String> ideas = List.of(
                "Parfum", "Socks", "Sweather", "Cup",
                "Hat", "Tea", "Coffee", "Clock", "Bag",
                "Book", "Wallet", "Cream", "Earrings");

        System.out.println("Gift ideas to bites - step by step: ");
        convertGiftsToBitesStepByStep(ideas);
        System.out.println("Gift ideas to bites - using functions: ");
        convertGiftsToBitesUsingFunctions(ideas);
    }

    private static void convertGiftsToBitesUsingFunctions(List<String> ideas) {
        for (String idea : ideas) {
            System.out.print(idea + ": ");
            byte[] bytes = idea.getBytes(StandardCharsets.UTF_8);

            for (byte b : bytes) {
                System.out.print(Integer.toBinaryString(b) + " ");
            }
            System.out.println();
        }
    }

    private static void convertGiftsToBitesStepByStep(List<String> ideas) {
        for (String idea : ideas) {
            System.out.print(idea + ": ");
            byte[] bytes = getBytesFromString(idea);

            for (byte b : bytes) {
                System.out.print(convertDecimalToBinary(b) + " ");
            }
            System.out.println();
        }
    }

    private static byte[] getBytesFromString(String idea) {
        byte[] utf8Codes = new byte[idea.length()];
        for (int i = 0; i < idea.length(); i++) {
            char charAt = idea.charAt(i);
            utf8Codes[i] = (byte) charAt;
        }

        return utf8Codes;
    }

    private static String convertDecimalToBinary(byte decimal) {
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int rest = decimal % 2;
            binary.append(rest);

            decimal = (byte) (decimal / 2);
        }

        return binary.reverse().toString();
    }
}
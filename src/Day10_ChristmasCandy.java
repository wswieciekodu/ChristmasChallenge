import static java.lang.Math.*;

public class Day10_ChristmasCandy {

    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
     * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli (terminalu)
     * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie laskę cukrową.
     * Jeżeli potrafisz, nie wpisuj laski bezpośrednio w printy - pokombinuj z pętlami.
     * Tak, żeby laska wygenerowała się sama!
     */

    public static void main(String[] args) {

        int height = 16;

        drawCandy(height);
    }

    private static void drawCandy(int height) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";

        int radius = height / 4;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x <= height / 2; x++) {
                int circleFormula = (int) (sqrt(pow(x - radius, 2) + pow(y - radius, 2)));
                boolean yLessThanHalfCircle = y <= radius;
                boolean aroundCircle = circleFormula == radius;
                boolean xLocatedAtLastVerticalLine = x == height / 2;
                boolean yBelowHalfCircle = y >= radius;

                if (yLessThanHalfCircle && aroundCircle || xLocatedAtLastVerticalLine && yBelowHalfCircle) {
                    boolean isLineEven = y % 2 == 0;
                    if (isLineEven) {
                        System.out.print(ANSI_RED + "*" + ANSI_RESET);
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
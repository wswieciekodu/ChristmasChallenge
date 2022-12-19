import model.Box;

import static java.lang.Math.ceil;

public class Day19_WrappingPaper {

    /**
     * Mikołaj zapakował już prezenty w pudełka i potrzebuje Twojej pomocy!
     * Ma 5 pudełek o wielkości 10cmx13cmx15cm, 10 o wielkości 20cmx15cmx10cm i 3 o wielkości 30cmx25cmx20cm.
     * Pomoż Mikołajowi! Oblicz i wypisz na ekranie, ile metrów kwadratowych papieru do pakowania prezentów musi kupić Mikołaj.
     * Wynik zaokrglij do pełnego metra w górę.
     * Załóż dla uproszczenia, że dla każdego prezentu musi kupić pole powierzchni pudełka, nie uwględniaj strat i zakładek.
     * Przygotuj funkcje liczaca ilosc potrzebnego papieru dla pudelka i uzyj jej dla kazdego pudeka.
     */

    public static void main(String[] args) {

        Box small = new Box(10, 13, 15);
        int paperForSmallBox = calculateSurfaceOfBox(small.getX(), small.getY(), small.getZ());

        Box medium = new Box(20, 15, 10);
        int paperForMediumBox = calculateSurfaceOfBox(medium.getX(), medium.getY(), medium.getZ());

        Box big = new Box(30, 25, 20);
        int paperForBigBox = calculateSurfaceOfBox(big.getX(), big.getY(), big.getZ());

        int smallBoxesAmount = 5;
        int mediumBoxesAmount = 10;
        int bigBoxesAmount = 3;

        int neededPaperInCm2 = paperForSmallBox * smallBoxesAmount + paperForMediumBox * mediumBoxesAmount + paperForBigBox * bigBoxesAmount;
        int neededPaperInM2 = (int) ceil(convertCm2ToM2(neededPaperInCm2));

        System.out.println("Santa needs " + neededPaperInM2 + " m2 of wrapping paper.");
    }

    private static double convertCm2ToM2(int cm2) {
        return cm2 / 10000.0;
    }

    private static int calculateSurfaceOfBox(int x, int y, int z) {
        return x * y * 2 + x * z * 2 + y * z * 2;
    }
}
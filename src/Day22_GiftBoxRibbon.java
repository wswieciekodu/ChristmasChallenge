import model.Box;

public class Day22_GiftBoxRibbon {
    /**
     * Mikołaj zapakował prezenty w pudełka i papier i chce jeszcze obwiązać je wstążką.
     * Ma 5 pudełek o wielkości 10cmx13cmx15cm.
     * Oblicz i wypisz na ekranie, ile metrów wstążki musi kupić Mikołaj.
     * Załóż, że dla każdego prezentu musi kupić tyle wstążki,
     * żeby obwiązać prezent oddzielnie z dwóch stron + dla każdej strony mieć zapas 50%.
     * Niech wstązka krzyzuje sie na sciance o największej powierzchni.
     */
    public static void main(String[] args) {
        Box box = new Box(10, 13, 15);
        int boxesAmount = 5;

        double neededRibbonInCm = boxesAmount * calculateRibbonForBox(box.getZ(), box.getY(), box.getX());
        double neededRibbonInM = convertCmToM(neededRibbonInCm);

        System.out.println("Santa needs " + neededRibbonInM + " m of ribbon.");
    }

    private static double convertCmToM(double cm) {
        return cm / 100.0;
    }

    private static double calculateRibbonForBox(int longestSide, int mediumSide, int shortestSide) {
        return (2 * longestSide + 2 * shortestSide + 2 * mediumSide + 2 * shortestSide) * 1.5;
    }
}
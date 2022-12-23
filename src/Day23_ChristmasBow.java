public class Day23_ChristmasBow {

    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
     * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli.
     * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie kokardkę na choinkę.
     * Jeżeli potrafisz, nie wpisuj kokardki bezpośrednio w printy - pokombinuj z pętlami.
     * Tak, żeby kokardka wygenerowała się sama!
     */

    public static void main(String[] args) {

        int height = 8;

        drawBow(height);
    }

    private static void drawBow(int height) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < height; x++) {
                if (insideBow(x, y, height)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static boolean insideBow(int x, int y, int height) {
        return (x >= y && x < height - y) ||
                (x < y && x >= height - y);
    }

}
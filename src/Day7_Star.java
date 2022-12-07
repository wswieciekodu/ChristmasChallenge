public class Day7_Star {

    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
     * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli
     * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie gwiazdkę.
     * Jeżeli potrafisz, nie wpisuj gwiazdki bezposrednio w printy - pokombinuj z pętlami.
     * Tak, żeby gwiazdka wygenerowała się sama!
     * Gwiazdka może mieć dowolny kształt, wygeneruj taki jaki potrafisz. Przykładowe gwiazdki:
     *     *       *       *         *
     *     *         *   *        *******
     * *********   **********      *****
     *     *         *   *        *******
     *     *       *       *         *
     */

    public static void main(String[] args) {
        int size = 16;

        drawStar(size);
        // simpler version
        drawLinesStart(size);
    }

    private static void drawStar(int height) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < height * 2; x++) {
                if (isInsideTopTriangle(height, x, y) || isInsideBottomUpsideDownTriangle(height, x, y)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isInsideTopTriangle(int height, int x, int y) {
        int triangleHeight = height * 2 / 3;
        return y <= triangleHeight && y >= triangleHeight - x && y >= x - triangleHeight;
    }

    private static boolean isInsideBottomUpsideDownTriangle(int height, int x, int y) {
        int offsetY = height / 3;
        int triangleHeight = height * 2 / 3;
        return y >= offsetY && (y < x + height - triangleHeight && y < -x + height + triangleHeight);
    }

    private static void drawLinesStart(int size) {
        for (int y = 0; y <= size; y++) {
            for (int x = 0; x <= size * 2; x++) {
                if (isVerticalLine(size, x)
                        || isHorizontalLine(size, y)
                        || isRightDirectedLine(size, y, x)
                        || isLeftDirectedLine(size, y, x)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    private static boolean isLeftDirectedLine(int size, int y, int x) {
        return 2 * y == x;
    }

    private static boolean isRightDirectedLine(int size, int y, int x) {
        return 2 * y == -x + size * 2;
    }

    private static boolean isHorizontalLine(int size, int y) {
        return y == size / 2;
    }

    private static boolean isVerticalLine(int size, int x) {
        return x == size;
    }
}
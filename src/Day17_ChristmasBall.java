import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.pow;

public class Day17_ChristmasBall {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";

    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
     * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli (terminalu)
     * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie bombkę choinkową.
     * Jeżeli potrafisz, nie wpisuj bombki bezpośrednio w printy - pokombinuj z pętlami.
     * Tak, żeby bombka wygenerowała się sama!
     * Bombka może mieć dowolny kształt, ale najlepiej, żeby była okrągła. :)
     */

    public static void main(String[] args) throws InterruptedException, IOException {

        int height = 12;

        drawChristmasBall(height);

        // Attention! Below version works only in cmd (not in Intellij Console)
        // And in Win10 you need to turn on ANSI handling in console changing registry entry
        // In Intellij it will draw ball after ball instead of animation
        // drawChristmasBallWithAnimation(height);
    }

    private static void drawChristmasBall(int height) {
        int radius = height / 2;

        for (int y = 1; y <= height; y++) {
            for (int x = 1; x <= 4 * radius; x++) {
                int powX = (int) pow(0.5 * x - radius, 2);
                int powY = (int) pow(0.9 * y - radius, 2);

                if (powX + powY < pow(radius, 2)) {
                    System.out.print(ANSI_RED + "*" + ANSI_RESET);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void drawChristmasBallWithAnimation(int height) throws InterruptedException, IOException {

        int radius = height / 2;
        boolean secondView = false;

        while (true) {
            secondView = !secondView;
            clearConsole();
            int currentStar = 0;
            for (int y = 0; y <= height; y++) {
                for (int x = 0; x <= 8 * radius; x++) {
                    int powX = (int) pow(0.5 * x - radius, 2);
                    int powY = (int) pow(y - radius, 2);

                    if (powX + powY < pow(radius, 2)) {
                        int changeLines = secondView ? 0 : 1;

                        if ((currentStar + changeLines) % 3 == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(ANSI_RED + "*" + ANSI_RESET);
                        }
                        currentStar++;
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            TimeUnit.MILLISECONDS.sleep(500);
        }
    }

    private static void clearConsole() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
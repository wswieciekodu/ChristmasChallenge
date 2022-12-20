import java.awt.Toolkit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Day20_JingleRhythm {

    /**
     * Świąteczne piosenki to coś co lubimy wszyscy. Niektórzy lubią ich słuchać, ale niektorzy także grać na pianinie!
     * Przygotuj symulator rytmu piosenki Jingle Bells. W tablicy poniżej znajdziesz długości kolejnych nut.
     * Na terminalu wypisuj kolejne gwiazdki dla każdej nuty przez określony długością nuty czas.
     * Przykładowo 300ms * czas określony dla nuty w tablicy. Dla efektu dźwiękowego możesz też użyć beep!
     */

    public static void main(String[] args) throws InterruptedException, IOException {

        int[] tones = {
                2, 2, 4, 2, 2, 4, 2, 2, 2, 1, 8, 2, 2, 2, 1, 2, 2, 2, 1, 1,
                2, 2, 2, 2, 4, 4, 2, 2, 4, 2, 2, 4, 2, 2, 2, 1, 8, 2, 2, 2, 1,
                2, 2, 2, 1, 1, 2, 2, 2, 2, 8, 2, 2, 2, 2, 4, 1, 1, 2, 2, 2, 2, 8,
                2, 2, 2, 2, 8, 2, 2, 2, 2, 8, 2, 2, 2, 2, 8,
                2, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 8
        };

        for (int tone : tones) {
            System.out.print("* ");
            Toolkit.getDefaultToolkit().beep();
            TimeUnit.MILLISECONDS.sleep(tone * 300);
        }
    }
}
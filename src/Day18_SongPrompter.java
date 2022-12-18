import java.util.concurrent.TimeUnit;

public class Day18_SongPrompter {
    /**
     * W świeta lubimy śpiewać koledy i świąteczne piosenki. Przygotuj prompter dla koledy lub piosenki.
     * Niech tekst linijka po linijce wyświetla sie co 3 sekunde w terminalu.
     * Przykladowy tekst znajdziesz ponizej, ale mozesz zamienić go na tekst Twojej ulubionej piosenki lub koledy!
     */

    public static void main(String[] args) throws InterruptedException {

        String lyrics = "Bog sie rodzi, moc truchleje\n"
                + "Pan niebiosow obnazony!\n"
                + "Ogien krzepnie, blask ciemnieje.\n"
                + "Ma granice Nieskonczony\n"
                + "Wzgardzony, okryty chwala\n"
                + "Smiertelny Krol nad wiekami!\n"
                + "A Slowo Cialem sie stalo\n"
                + "I mieszkalo miedzy nami";

        String[] lines = lyrics.split("\n");

        for (String line : lines) {
            System.out.println(line);
            TimeUnit.SECONDS.sleep(3);
        }
    }
}
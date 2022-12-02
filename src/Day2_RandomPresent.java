import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class Day2_RandomPresent {

    /**
     * Mikołaj postanowił w tym roku skorzystać z pomocy nowoczesnych technologii.
     * Zamiast zastanawiać się, komu jaki prezent dostarczyć postanowił skorzystać z programu.
     * Pomoż Mikołajowi!
     * Przygotuj kod, który z listy dostępnych prezentów wylosuje 3 prezenty i wypisze na ekranie.
     * Odpal program kilka razy - sprawdź, czy na pewno losuje za kazdym razem inne prezenty!
     * Wylosowane prezenty wypisz na ekranie. Zadbaj o to, żeby wylosowane prezenty były unikalne.
     */
    public static final int GIFTS_SIZE = 3;

    public static void main(String[] args) {

        List<String> ideas = List.of(
                "Perfume", "Socks", "Sweater", "Cup",
                "Hat", "Tea", "Coffee", "Clock", "Bag",
                "Book", "Wallet", "Cream", "Earrings");

        RandomGenerator randomGenerator = RandomGenerator.getDefault();

        Set<Integer> randomNumbers = new HashSet<>();

        while (randomNumbers.size() != GIFTS_SIZE) {
            randomNumbers.add(randomGenerator.nextInt(ideas.size()));
        }

        List<String> randomGifts = randomNumbers.stream()
                .map(ideas::get)
                .toList();

        System.out.println("Random gifts: " + randomGifts);
    }
}
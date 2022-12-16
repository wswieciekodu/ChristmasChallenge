import model.ChildWithBirthDate;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Day16_FindOldestAndYoungest {

    /**
     * Mikołaj przygotował dodatkowe prezenty dla najmłodszego i najstarszego dziecka.
     * Pomóż mu znaleźć je w liście.
     * Wypisz na ekran znalezione dzieci wraz z informacja, które jest najstarsze, a które najmłodsze.
     */

    public static void main(String[] args) {

        List<ChildWithBirthDate> children = prepareChildren();

        showYoungestOldestStepByStep(children);
        showYoungestOldestWithStream(children);
    }


    private static void showYoungestOldestStepByStep(List<ChildWithBirthDate> children) {
        ChildWithBirthDate oldest = children.get(0);
        ChildWithBirthDate youngest = children.get(0);

        for (int i = 1; i < children.size(); i++) {
            if (children.get(i).getDateOfBirth().isAfter(youngest.getDateOfBirth())) {
                youngest = children.get(i);
            }

            if (children.get(i).getDateOfBirth().isBefore(oldest.getDateOfBirth())) {
                oldest = children.get(i);
            }
        }

        System.out.println("Oldest: " + oldest);
        System.out.println("Youngest: " + youngest);
    }

    private static void showYoungestOldestWithStream(List<ChildWithBirthDate> children) {
        children
                .stream()
                .min(Comparator.comparing(ChildWithBirthDate::getDateOfBirth))
                .ifPresent(oldest -> System.out.println("Oldest: " + oldest));

        children
                .stream()
                .max(Comparator.comparing(ChildWithBirthDate::getDateOfBirth))
                .ifPresent(youngest -> System.out.println("Youngest: " + youngest));
    }

    private static List<ChildWithBirthDate> prepareChildren() {
        return List.of(
                new ChildWithBirthDate(
                        "Jasiu",
                        "Kowalski",
                        LocalDate.of(2010, 12, 30)
                ),
                new ChildWithBirthDate(
                        "Kasia",
                        "Nowak",
                        LocalDate.of(2011, 11, 30)),
                new ChildWithBirthDate(
                        "Asia",
                        "Wisniewska",
                        LocalDate.of(2010, 12, 31)),
                new ChildWithBirthDate(
                        "Tomek",
                        "Wojcik",
                        LocalDate.of(2015, 6, 30)),
                new ChildWithBirthDate(
                        "Tomek",
                        "Zajac",
                        LocalDate.of(2020, 12, 30))
        );
    }
}
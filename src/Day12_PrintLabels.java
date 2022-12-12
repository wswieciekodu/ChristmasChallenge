import model.Address;
import model.ChildWithAddress;

import java.util.List;

public class Day12_PrintLabels {

    /**
     * Pomóż Mikołajowi przygotować etykiety do druku na prezenty!
     * Dla każdego dziecka z listy wypisz w konsoli imię, nazwisko i adres w formacie jak na list.
     * Rozdziel przygotowane etykiety liniami.
     */

    public static void main(String[] args) {

        List<ChildWithAddress> children = prepareChildren();

        // TODO: Print labels
    }

    private static List<ChildWithAddress> prepareChildren() {
        return List.of(
                new ChildWithAddress(
                        "Jasiu",
                        "Kowalski",
                        new Address("Serniczkowa",
                                "4B",
                                2,
                                "Krakow",
                                "02-326"
                        )),
                new ChildWithAddress(
                        "Kasia",
                        "Nowak",
                        new Address("Pierniczkowa",
                                "289",
                                55,
                                "Gdansk",
                                "02-326"
                        )),
                new ChildWithAddress(
                        "Asia",
                        "Wisniewska",
                        new Address("Barszczykowa",
                                "234",
                                5,
                                "Rzeszow",
                                "37-326"
                        )),
                new ChildWithAddress(
                        "Tomek",
                        "Wojcik",
                        new Address("Uszkowa",
                                "43H",
                                5,
                                "Wroclaw",
                                "02-326"
                        ))
        );
    }
}
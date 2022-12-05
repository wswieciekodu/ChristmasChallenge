import model.Address;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Day5_SortAdresses {

    /**
     * Pomóż Mikołajowi w rozwożeniu prezentów!
     * Posortuj listę adresów dzieci po miastach alfabetycznie,
     * tak, żeby Mikołaj mógł wygodnie zaplanować plan podrózy.
     * Posortowaną listę adresów wypisz na ekranie.
     * To bardzo proste zadanie! Więc dodatkowym plusem będzie
     * wykonanie sortowania w jednej linijce. :D
     */

    public static void main(String[] args) {

        List<Address> addresses = prepareAddresses();

        // sortUsingComparator(addresses);

        // sortUsingListSortAndComparator(addresses);

        notModifyingListSortUsingStreamsAndComparator(addresses);
    }

    private static void notModifyingListSortUsingStreamsAndComparator(List<Address> addresses) {
        addresses.stream()
                .sorted(Comparator.comparing(Address::getCity))
                .forEach(System.out::println);
    }

    private static void sortUsingListSortAndComparator(List<Address> addresses) {
        addresses.sort(Comparator.comparing(Address::getCity));
        addresses.forEach(System.out::println);
    }

    private static void sortUsingComparator(List<Address> addresses) {
        addresses.sort(new Comparator<Address>() {
            @Override
            public int compare(Address address, Address otherAddress) {
                return address.getCity().compareTo(otherAddress.getCity());
            }
        });

        for (Address address : addresses) {
            System.out.println(address);
        }
    }

    private static List<Address> prepareAddresses() {
        List<Address> addresses = new ArrayList<>();

        addresses.add(new Address("Swiateczna",
                "234",
                5,
                "Warszawa",
                "02-326"));
        addresses.add(new Address("Choinkowa",
                "34A",
                1,
                "Krakow",
                "31-326"
        ));
        addresses.add(new Address("Mikolaja Swietego",
                "87",
                3,
                "Rzeszow",
                "40-326"
        ));
        addresses.add(new Address("Bombkowa",
                "214",
                55,
                "Gdansk",
                "15-326"
        ));
        addresses.add(new Address("Prezentowa",
                "543",
                765,
                "Warszawa",
                "02-326"
        ));
        addresses.add(new Address("Serniczkowa",
                "4B",
                2,
                "Krakow",
                "02-326"
        ));
        addresses.add(new Address("Pierniczkowa",
                "289",
                55,
                "Gdansk",
                "02-326"
        ));
        addresses.add(new Address("Barszczykowa",
                "234",
                5,
                "Rzeszow",
                "37-326"
        ));
        addresses.add(new Address("Uszkowa",
                "43H",
                5,
                "Wroclaw",
                "02-326"
        ));
        addresses.add(new Address("Cukierkowa",
                "23",
                5,
                "Poznan",
                "02-326"
        ));

        return addresses;
    }
}
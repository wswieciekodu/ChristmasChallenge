import model.Address;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Day8_DuplicatedAddresses {

    /**
     * Złośliwe chochliki poduplikowaly wpisy na liście adresów dzieci.
     * Pomóż Mikołajowi i zdeduplikuj listę. Wypisz wyczyszczoną z duplikatów listę na ekran.
     * Możesz usunąć niepotrzebne adresy z listy, albo utworzyć nową bez duplikatów.
     */

    public static void main(String[] args) {
        List<Address> addresses = prepareAddresses();

        // Solution 1 - using Set to deduplicate, NOT MODIFYING input list
        List<Address> deduplicatedUsingSet = new ArrayList<>(new HashSet<>(addresses));

        // Solution 2 - with stream, NOT MODIFYING input list
        List<Address> deduplicatedUsingStream = addresses.stream().distinct().toList();

        // Solution 3 - Basic, simplest way with two loops, NOT MODIFYING input list
        for (int i = 0; i < addresses.size(); i++) {
            for (int j = i + 1; j < addresses.size(); j++) {
                if (addresses.get(i).equals(addresses.get(j))) {
                    addresses.remove(addresses.get(j));
                    j--;
                }
            }
        }

        System.out.println(addresses);
    }

    private static List<Address> prepareAddresses() {
        List<Address> addresses = new ArrayList<>();

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
        addresses.add(new Address("Pierniczkowa",
                "289",
                55,
                "Gdansk",
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
        addresses.add(new Address("Uszkowa",
                "43H",
                5,
                "Wroclaw",
                "02-326"
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
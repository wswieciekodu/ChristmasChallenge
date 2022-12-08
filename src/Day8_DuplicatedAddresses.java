import model.Address;

import java.util.ArrayList;
import java.util.List;

public class Day8_DuplicatedAddresses {

    /**
     * Złośliwe chochliki poduplikowaly wpisy na liście adresów dzieci.
     * Pomóż Mikołajowi i zdeduplikuj listę. Wypisz wyczyszczoną z duplikatów listę na ekran.
     * Możesz usunąć niepotrzebne adresy z listy, albo utworzyć nową bez duplikatów.
     */

    public static void main(String[] args) {
        List<Address> addresses = prepareAddresses();

        //TODO: Deduplicate list
        
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
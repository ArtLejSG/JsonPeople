package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapter.*;
import ru.aiteko.users.*;
import java.util.stream.*;

public class CreditCardsStats implements Runnable{
    public void run(){
        Root root = GsonParser.parse();
        assert root != null;

        root.data.stream()
                .map(object -> object.getCreditCard().getIssuer())
                .collect(Collectors.groupingBy(issuer -> issuer, Collectors.counting()))
        .forEach((issuer, count) -> System.out.printf("Карт %s - %d\n",issuer, count));
        System.out.println();
    }
}

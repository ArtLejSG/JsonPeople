package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapter.*;
import ru.aiteko.users.*;

public class UniqueCompanyNames implements Runnable{
    @Override
    public void run() {

        Root root = GsonParser.parse();
        assert root != null;
        System.out.println("Уникальные названия компаний: ");
        root.data.stream()
                .map(company -> company.getJob().getCompany())
                .distinct()
                .forEach(System.out::println);
        System.out.println();
    }
}


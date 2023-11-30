package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapter.*;
import ru.aiteko.users.*;
import java.util.List;
import java.math.*;
import java.util.stream.*;

public class SortedHighPaid implements Runnable{
    @Override
    public void run(){
        Root root = GsonParser.parse();
        assert root != null;

       List <String> highPaidProfession = root.data.stream()
                .filter(object -> object.getMonthlySalary().compareTo(BigDecimal.valueOf(500.00))>0)
                .map(profession -> profession.getJob().getTitle())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
                highPaidProfession.forEach(System.out::println);
        System.out.println();
}
}

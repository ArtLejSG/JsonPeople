package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapter.*;
import ru.aiteko.users.*;

import java.math.*;
import java.time.*;
import java.time.temporal.*;

public class SpecificObjectAndEmail implements Runnable {
    @Override
    public void run() {
        Root root = GsonParser.parse();
        assert root != null;

        root.data.stream()
                .filter(object -> ChronoUnit.YEARS.between(object.getBirthday(), LocalDateTime.now()) > 30)
                .filter(status -> status.getStatus().equals(ActiveStatus.ACTIVE))
                .filter(paid -> paid.getMonthlySalary().compareTo(BigDecimal.valueOf(100.00)) < 0)
                .filter(object -> object.getEmails().stream().allMatch(email -> email.endsWith("@example.com")))
                .map(name -> name.getName() + " | " + name.getEmails())
                .forEach(System.out::println);
        System.out.println();
    }
}


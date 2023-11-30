package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapter.*;
import ru.aiteko.users.*;

import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class YoungUserAndHighPaid implements Runnable {
    @Override
    public void run() {

        Root root = GsonParser.parse();
        assert root != null;

        root.data.stream()
                .filter(object -> ChronoUnit.YEARS.between(object.getBirthday(), LocalDateTime.now()) < 21)
                .filter(status -> status.getStatus().equals(ActiveStatus.ACTIVE))
                .max(Comparator.comparing(salary -> salary.getMonthlySalary()))
                .ifPresent(name -> System.out.println("Самый высокооплачиваемый активный пользователь до 21 года: " + name.getName()));
        System.out.println();
    }
}


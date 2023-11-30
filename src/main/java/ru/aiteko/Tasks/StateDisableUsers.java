package ru.aiteko.Tasks;
import ru.aiteko.GsonParserAndTypeAdapter.GsonParser;
import ru.aiteko.users.Root;
import ru.aiteko.users.ActiveStatus;

import java.util.Map;
import java.util.stream.Collectors;

public class StateDisableUsers implements Runnable {
    @Override
    public void run() {
        Root root = GsonParser.parse();
        assert root != null;

            root.data.stream()
                    .filter(status -> status.getStatus().equals(ActiveStatus.DISABLED))
                    .map(object -> object.getLocation().getState())
                    .collect(Collectors.groupingBy(state -> state, Collectors.counting()))
                    .entrySet().stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                    .limit(5)
                    .forEach((entry) ->
                            System.out.printf("%s - %d неактивных пользователей.\n", entry.getKey(), entry.getValue()));
            System.out.println();

    }
}

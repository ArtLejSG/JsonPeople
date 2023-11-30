package ru.aiteko.Tasks;
import ru.aiteko.users.Root;
import ru.aiteko.users.User;
import ru.aiteko.GsonParserAndTypeAdapter.GsonParser;
import ru.aiteko.users.ActiveStatus;

public class ActiveObjects implements Runnable {
    @Override
    public void run(){
        Root root = GsonParser.parse();
        assert root != null;

        System.out.println("Список Активных Пользователей: ");
        root.data.stream()
                .filter(object -> object.getStatus().equals(ActiveStatus.ACTIVE))
                .map(User::getName)
                .forEach(System.out::println);
    }

}

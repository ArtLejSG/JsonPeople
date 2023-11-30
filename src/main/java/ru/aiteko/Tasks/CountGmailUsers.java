package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapter.*;
import ru.aiteko.users.*;

public class CountGmailUsers implements Runnable{
    @Override
    public void run(){
        Root root = GsonParser.parse();
        assert root != null;


        long count = root.data.stream()
                .filter(object -> object.getEmails().stream().allMatch(email -> email.endsWith("@gmail.com")))
                .count();
        System.out.printf(
                "\nКоличество Пользователей пользующихся только gmail почтой: %d\n\n", count);
    }
}

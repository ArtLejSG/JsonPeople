package ru.aiteko;
import ru.aiteko.Tasks.*;
import ru.aiteko.Tasks.Runnable;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) {
        Stream.of(new ActiveObjects(), new CountGmailUsers(),
                new CreditCardsStats(), new SortedHighPaid(),
                new SpecificObjectAndEmail(),new StateDisableUsers(),
                new YoungUserAndHighPaid(), new UniqueCompanyNames()
        ).forEach(Runnable::run);
    }
}

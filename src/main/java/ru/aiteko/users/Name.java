package ru.aiteko.users;

import lombok.*;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Name {
    private String first;
    private String middle;
    private String last;
}

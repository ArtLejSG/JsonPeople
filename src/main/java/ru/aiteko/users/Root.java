package ru.aiteko.users;

import java.util.ArrayList;
import java.util.Objects;

public class Root {

    public ArrayList<User> data;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Root root = (Root) o;
        return Objects.equals(data, root.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
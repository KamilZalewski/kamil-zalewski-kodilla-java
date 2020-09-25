package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1, "Kamil Zalewski", 'M', 1989, 6, 16, 10));
        usersList.add(new ForumUser(2, "Paula Zalewska", 'K', 1990, 7, 31, 5));
        usersList.add(new ForumUser(3, "Adam Zalewski", 'M', 1983, 5, 17, 3));
        usersList.add(new ForumUser(4, "Justyna Zalewska - Rejdak", 'K', 1975, 5, 10, 15));
        usersList.add(new ForumUser(5, "Przemysław Rejdak", 'M', 1975, 2, 18, 0));
        usersList.add(new ForumUser(6, "Waldemar Szabat", 'M', 1965, 7, 14, 5));
        usersList.add(new ForumUser(7, "Tymoteusz Rejdak", 'M', 2007, 9, 21, 50));
        usersList.add(new ForumUser(8, "Zuzanna Rejdak", 'M', 2003, 8, 14, 22));
        usersList.add(new ForumUser(9, "Alicja Szabat", 'K', 1999, 2, 22, 4));
        usersList.add(new ForumUser(10, "Andrzej Swirski", 'M', 1989, 4, 8, 7));
    }

    public List<ForumUser> getUsersList() {
        return usersList;
    }
}

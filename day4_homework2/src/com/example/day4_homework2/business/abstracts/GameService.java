package com.example.day4_homework2.business.abstracts;

import com.example.day4_homework2.entities.concretes.Game;
import com.example.day4_homework2.entities.concretes.User;

public interface GameService {
    void addGame(Game game, User user);
    void updateGame(Game game, User user);
    void deleteGame(Game game, User user);
}

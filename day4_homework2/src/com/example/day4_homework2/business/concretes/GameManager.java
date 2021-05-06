package com.example.day4_homework2.business.concretes;

import com.example.day4_homework2.business.abstracts.GameService;
import com.example.day4_homework2.entities.concretes.Game;
import com.example.day4_homework2.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class GameManager implements GameService {
    List<Game> games =  new ArrayList<>();

    @Override
    public void addGame(Game game, User user) {
        System.out.println(user.getFirstName() +" has new game: " + game.getName());
        games.add(game);
        user.setGamesOfUser(games);
    }

    @Override
    public void updateGame(Game game, User user) {
        System.out.println(user.getFirstName() + "'s game data updated: " + game.getName());
    }

    @Override
    public void deleteGame(Game game, User user) {
        System.out.println(user.getFirstName() +"'s game data deleted: " + game.getName());
    }
}

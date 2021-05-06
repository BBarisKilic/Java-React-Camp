package com.example.day4_homework2;

import com.example.day4_homework2.business.abstracts.CampaignService;
import com.example.day4_homework2.business.abstracts.GameService;
import com.example.day4_homework2.business.abstracts.UserService;
import com.example.day4_homework2.business.concretes.CampaignManager;
import com.example.day4_homework2.business.concretes.GameManager;
import com.example.day4_homework2.business.concretes.UserManager;
import com.example.day4_homework2.core.EDevletManagerAdapter;
import com.example.day4_homework2.dataAccess.concretes.HibernateUserDao;
import com.example.day4_homework2.entities.concretes.Campaign;
import com.example.day4_homework2.entities.concretes.Game;
import com.example.day4_homework2.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User baris = new User(0,"22233445566", "Baris", "Kilic", "1995");
        UserService barisService = new UserManager(new EDevletManagerAdapter(), new HibernateUserDao());
        barisService.addUser(baris);

        System.out.println("Baris' games: " + baris.getGamesOfUser().toArray().length);

        Game redAlert2 = new Game(0,0, "Red Alert 2", 39.99);
        GameService barisGameService = new GameManager();
        barisGameService.addGame(redAlert2, baris);

        System.out.println("Baris' games: " + baris.getGamesOfUser().toArray().length);

        Campaign blackFriday = new Campaign(0, "Black Friday", "#BLACKFREE99", 20.0);
        CampaignService blackFridayService = new CampaignManager();

        Game pes6 = new Game(1,0, "Pes 6", 59.98);
        blackFridayService.addCampaign(blackFriday, pes6);
        barisGameService.addGame(pes6, baris);
        System.out.println("Baris' games: " + baris.getGamesOfUser().toArray().length);
    }
}

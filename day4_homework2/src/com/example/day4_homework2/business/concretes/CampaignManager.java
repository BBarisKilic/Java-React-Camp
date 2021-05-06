package com.example.day4_homework2.business.concretes;

import com.example.day4_homework2.business.abstracts.CampaignService;
import com.example.day4_homework2.entities.concretes.Campaign;
import com.example.day4_homework2.entities.concretes.Game;

public class CampaignManager implements CampaignService {

    @Override
    public void addCampaign(Campaign campaign, Game game) {
        System.out.println(game.getName() + "'s price is decreased because of " + campaign.getName() + " campaign.");
        System.out.println("Discount rate: " + campaign.getDiscount() + "%");
        System.out.println(game.getName() + "'s price before discount: $" + game.getUnitPrice() + ", after discount: $" +game.getUnitPrice() * (100 - campaign.getDiscount()) / 100);
    }

    @Override
    public void updateCampaign(Campaign campaign, Game game) {
        System.out.println(game.getName() + "'s price is updated because of " + campaign.getName() + " campaign.");
    }

    @Override
    public void deleteCampaign(Campaign campaign, Game game) {
        System.out.println(game.getName() + "'s price is updated because " + campaign.getName() + " campaign ended.");
    }
}

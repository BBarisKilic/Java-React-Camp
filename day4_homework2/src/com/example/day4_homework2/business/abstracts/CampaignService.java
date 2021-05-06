package com.example.day4_homework2.business.abstracts;

import com.example.day4_homework2.entities.concretes.Campaign;
import com.example.day4_homework2.entities.concretes.Game;

public interface CampaignService {
    void addCampaign(Campaign campaign, Game game);
    void updateCampaign(Campaign campaign, Game game);
    void deleteCampaign(Campaign campaign, Game game);
}

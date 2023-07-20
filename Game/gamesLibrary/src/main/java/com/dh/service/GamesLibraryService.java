package com.dh.service;

import com.dh.client.GamesServiceClient;
import org.springframework.stereotype.Service;;

import java.util.List;

@Service
public class GamesLibraryService {

    private GamesServiceClient gamesServiceClient;

    public GamesLibraryService(GamesServiceClient gamesServiceClient) {
        this.gamesServiceClient = gamesServiceClient;
    }

    public List<GamesServiceClient.GamesDto> getGamesByUser(Integer id) {
        return gamesServiceClient.getGamesByUser(id);

    }
}

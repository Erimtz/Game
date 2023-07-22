package com.dh.service;

import com.dh.model.Games;
import com.dh.repository.GamesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {

    private GamesRepository gamesRepository;

    public GamesService(GamesRepository gamesRepository) {
        this.gamesRepository = gamesRepository;
    }

    public List<Games> findByName(Integer id) {
        return gamesRepository.findByName(String.valueOf(id));
    }

    public Games save(Games games) {
        return gamesRepository.save(games);
    }

}

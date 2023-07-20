package com.dh.controller;

import com.dh.model.Games;
import com.dh.service.GamesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GamesController {

    private GamesService gamesService;

    public GamesController(GamesService gamesService) {
        this.gamesService = gamesService;
    }

    @GetMapping("/games")
    ResponseEntity<List<Games>> getGamesByName(@PathVariable String name) {
        return ResponseEntity.ok().body(gamesService.findByName(name));
    }

}

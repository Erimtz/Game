package com.dh.controller;

import com.dh.model.Games;
import com.dh.service.GamesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GamesController {

    private GamesService gamesService;

    public GamesController(GamesService gamesService) {
        this.gamesService = gamesService;
    }

    @GetMapping("/{id}")
    ResponseEntity<List<Games>> getGamesByUser(Integer id) {
        return ResponseEntity.ok().body(gamesService.findByName(id));
    }

    @PostMapping("/save")
    ResponseEntity<Games> saveGame(@RequestBody Games games) {
        return ResponseEntity.ok(gamesService.save(games));
    }

}

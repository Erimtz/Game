package com.dh.controller;

import com.dh.client.GamesServiceClient;
import com.dh.service.GamesLibraryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/gamesLibrary")
public class GamesLibraryController {

    private GamesLibraryService gamesLibraryService;

    public GamesLibraryController(GamesLibraryService gamesLibraryService) {
        this.gamesLibraryService = gamesLibraryService;
    }

    @GetMapping({"/library/{id}"})
    ResponseEntity<List<GamesServiceClient.GamesDto>> getGamesByUser(Integer id) {
        return ResponseEntity.ok(this.gamesLibraryService.getGamesByUser(id));
    }
}

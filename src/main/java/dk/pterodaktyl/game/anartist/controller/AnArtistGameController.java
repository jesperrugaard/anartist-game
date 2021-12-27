package dk.pterodaktyl.game.anartist.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dk.pterodaktyl.game.anartist.api.Game;

@RestController
public class AnArtistGameController {

    static Map<String, Game> games = new HashMap<>();

    @PostMapping
    public Game game(@RequestParam List<String> players) {
        Game game = new Game();
        //Get art phrase 
        //Give art phrase to all the players except one
        return game;

    }

}

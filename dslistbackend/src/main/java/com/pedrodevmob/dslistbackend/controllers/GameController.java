package com.pedrodevmob.dslistbackend.controllers;

import com.pedrodevmob.dslistbackend.dtos.GameMinDTO;
import com.pedrodevmob.dslistbackend.entities.Game;
import com.pedrodevmob.dslistbackend.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/games")
public class GameController {
    @Autowired
    private GameService gameService;

    //Get de buscar todos os jogos
    @GetMapping()
    public List<GameMinDTO> findAllGames(){
        return gameService.findAllGames();
    }
}

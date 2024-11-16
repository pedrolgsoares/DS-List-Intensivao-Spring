package com.pedrodevmob.dslistbackend.services;

import com.pedrodevmob.dslistbackend.dtos.GameMinDTO;
import com.pedrodevmob.dslistbackend.entities.Game;
import com.pedrodevmob.dslistbackend.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAllGames(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}

package com.gmail.lucasffrezende.treinodslist.services;

import com.gmail.lucasffrezende.treinodslist.entities.Game;
import com.gmail.lucasffrezende.treinodslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<Game> findAll() {
        List<Game> result = gameRepository.findAll();
        return result;
    }

}

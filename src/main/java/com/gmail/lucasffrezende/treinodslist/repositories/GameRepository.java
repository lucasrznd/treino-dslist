package com.gmail.lucasffrezende.treinodslist.repositories;

import com.gmail.lucasffrezende.treinodslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}

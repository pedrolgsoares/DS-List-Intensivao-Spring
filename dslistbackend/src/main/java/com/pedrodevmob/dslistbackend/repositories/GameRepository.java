package com.pedrodevmob.dslistbackend.repositories;

import com.pedrodevmob.dslistbackend.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}

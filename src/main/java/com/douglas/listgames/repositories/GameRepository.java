package com.douglas.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.listgames.entities.Game;

public interface GameRepository  extends JpaRepository<Game, Long> {

}

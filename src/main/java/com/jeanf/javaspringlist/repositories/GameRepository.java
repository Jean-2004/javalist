package com.jeanf.javaspringlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanf.javaspringlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

package com.jeanf.javaspringlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanf.javaspringlist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

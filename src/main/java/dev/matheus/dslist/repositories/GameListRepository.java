package dev.matheus.dslist.repositories;

import dev.matheus.dslist.entities.Game;
import dev.matheus.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}

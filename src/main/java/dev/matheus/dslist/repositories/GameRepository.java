package dev.matheus.dslist.repositories;

import dev.matheus.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    @Query("SELECT g FROM Game g INNER JOIN Belonging b ON b.belongingPK.game.id = g.id WHERE b.belongingPK.gameList.id = :listId")
    List<Game> findGamesInList(Long listId);
}

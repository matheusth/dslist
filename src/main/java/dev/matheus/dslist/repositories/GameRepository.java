package dev.matheus.dslist.repositories;

import dev.matheus.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    @Query("SELECT g FROM Game g INNER JOIN Belonging b ON b.belongingPK.game.id = g.id WHERE b.belongingPK.gameList.id = :listId ORDER BY b.position ASC")
    List<Game> findGamesInList(@Param("listId") Long listId);
}

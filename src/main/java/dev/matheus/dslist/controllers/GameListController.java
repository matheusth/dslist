package dev.matheus.dslist.controllers;

import dev.matheus.dslist.dto.GameListDTO;
import dev.matheus.dslist.dto.GameMinDTO;
import dev.matheus.dslist.services.GameListService;
import dev.matheus.dslist.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {
    private final GameListService gameListService;
    private final GameService gameService;
    public GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }
    @GetMapping("/{listId}/games")
    public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable Long listId){
        List<GameMinDTO> gamesInList = gameService.findByList(listId);
        return ResponseEntity.ok(gamesInList);
    }
}

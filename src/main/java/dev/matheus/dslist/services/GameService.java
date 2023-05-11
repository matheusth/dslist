package dev.matheus.dslist.services;

import dev.matheus.dslist.dto.GameDTO;
import dev.matheus.dslist.dto.GameMinDTO;
import dev.matheus.dslist.entities.Game;
import dev.matheus.dslist.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game game = gameRepository.getReferenceById(id);
        return new GameDTO(game);
    }
}

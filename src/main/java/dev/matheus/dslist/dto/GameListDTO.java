package dev.matheus.dslist.dto;

import dev.matheus.dslist.entities.GameList;

public record GameListDTO(Long id, String name) {
    public GameListDTO(GameList game){
        this(game.getId(), game.getName());
    }
}

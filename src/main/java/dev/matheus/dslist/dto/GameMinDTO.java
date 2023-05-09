package dev.matheus.dslist.dto;

import dev.matheus.dslist.entities.Game;
import jakarta.persistence.Column;

public record GameMinDTO (
    Long id,
    String title,
    Integer year,
    String imgUrl,
    String shortDescription
){
    public GameMinDTO(Game game){
        this(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }
}

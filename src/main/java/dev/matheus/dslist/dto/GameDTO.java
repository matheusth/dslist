package dev.matheus.dslist.dto;

import dev.matheus.dslist.entities.Game;
import jakarta.persistence.Column;
import org.springframework.beans.BeanUtils;

public record GameDTO(
        Long id,
        String title,
        Integer year,
        String genre,
        String platforms,
        Double score,
        String imgUrl,
        String shortDescription,
        String longDescription

) {
    public GameDTO(Game game) {
        this(game.getId(), game.getTitle(), game.getYear(), game.getGenre(), game.getPlatforms(), game.getScore(),
                game.getImgUrl(), game.getShortDescription(), game.getLongDescription());
    }
}

package dev.matheus.dslist.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_belonging")
public class Belonging implements Serializable {
    @EmbeddedId
    private BelongingPK belongingPK;
    private Integer position;

    public Belonging(){

    }

    public Belonging(Game game, GameList gameList, Integer position) {
        this.belongingPK = new BelongingPK(game, gameList);
        this.position = position;
    }

    public BelongingPK getBelongingPK() {
        return belongingPK;
    }

    public Integer getPosition() {
        return position;
    }
}

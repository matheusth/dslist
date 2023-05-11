package dev.matheus.dslist.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
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

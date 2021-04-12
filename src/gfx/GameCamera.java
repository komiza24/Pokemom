package gfx;

import entities.Entity;
import pokemon.Game;
import tiles.Tile;

public class GameCamera {

    private Game game;
    private float xOffset, yOffset;

    public GameCamera(Game game, float xOffset, float yOffset) {
        this.game = game;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

    public void centerOnEntity(Entity e) {
        xOffset = e.getX()*Tile.TILEWIDTH - game.getWidth() / 2 + e.getHeight() / 2;
        yOffset = e.getY()*Tile.TILEHEIGHT - game.getHeight() / 2 + e.getHeight() / 2;
    }

    public void move(float xAmt, float yAmt) {
        xOffset += xAmt;
        yOffset += yAmt;
    }

    public float getxOffset() {
        return xOffset;
    }

    public void setxOffset(float xOffset) {
        this.xOffset = xOffset;
    }

    public float getyOffset() {
        return yOffset;
    }

    public void setyOffset(float yOffset) {
        this.yOffset = yOffset;
    }

}

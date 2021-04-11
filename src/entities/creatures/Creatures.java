package entities.creatures;

import entities.Entity;
import pokemon.Handler;

public abstract class Creatures extends Entity {

    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPPED = 1f;
    public static final int DEFAULT_CREATURE_WIDTH = 64,
            DEFAULT_CREATURE_HEIGHT = 64;
    protected int health;
    protected float speed;
    protected float xMove, yMove;

    public Creatures(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPPED;
        xMove = 0;
        yMove = 0;
    }

    public void move() {
        x += xMove * Creatures.DEFAULT_CREATURE_HEIGHT;
        y += yMove * Creatures.DEFAULT_CREATURE_WIDTH;
    }

    public int getHealth() {
        return health;
    }

    public float getSpeed() {
        return speed;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setxMove(float xMove) {
        this.xMove = xMove;
    }

    public void setyMove(float yMove) {
        this.yMove = yMove;
    }

    public float getxMove() {
        return xMove;
    }

    public float getyMove() {
        return yMove;
    }

}

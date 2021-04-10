/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.creatures;

import entities.Entity;
import pokemon.Game;

/**
 *
 * @author Brehm
 */
public abstract class Creatures extends Entity {

    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPPED = 1f; 
    public static final int DEFAULT_CREATURE_WIDTH = 64,
                            DEFAULT_CREATURE_HEIGHT = 64;

    protected int health;
    protected float speed;

    protected float xMove, yMove;

    public Creatures(float x, float y, int width, int height) {
        super(x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPPED;
        xMove = 0; 
        yMove = 0; 
    }
    
    
    public void move(){ 
       
        
        x+= xMove; 
        y+= yMove; 
       
        
        
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

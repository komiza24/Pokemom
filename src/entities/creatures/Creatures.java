package entities.creatures;

import entities.Entity;
import pokemon.Handler;
import tiles.Tile;

public abstract class Creatures extends Entity {

    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPPED =0.125f;   // größe des Spieler damit er sich nur in Tiles bewegt (1 tile ist eig 8x8 aber spieler 16x16 ) 
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
        
       moveX();
       moveY();
        
        
    }

    
    public void moveX(){ 
       
        if(xMove > 0){  //right
            int tx = (int) (x*Tile.TILEWIDTH + xMove + bounds.x + bounds.width)  /Tile.TILEWIDTH; 
            if(!collisionWithTile(tx, (int) (y*Tile.TILEHEIGHT + bounds.y) / Tile.TILEHEIGHT)){
                x += xMove; 
            }
        }else if(xMove < 0){
               x += xMove; 
        }
        
        
        
        
    }
    
    public void moveY(){ 
        
        y += yMove;
    }
    
    
    protected boolean collisionWithTile(int x, int y){ 
        
        return handler.getWorld().getTile(x, y).isSolid(); 
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.creatures;

import gfx.Assets;
import java.awt.Graphics;
import pokemon.Game;
import tiles.Tile;

/**
 *
 * @author Brehm
 */
public class Player extends Creatures {

    private Game game;
    private long lastTime, timer; 
    private int timeToWaitUntilTick; 
    public Player(Game game, float x, float y) {

        super(x, y, Creatures.DEFAULT_CREATURE_WIDTH, Creatures.DEFAULT_CREATURE_HEIGHT);
        this.game = game;
        
// timer 
timer = 0;
lastTime = System.currentTimeMillis(); 
timeToWaitUntilTick = 500; 

    }

    @Override
    public void tick() {
        
        timer += System.currentTimeMillis() - lastTime; 
        lastTime = System.currentTimeMillis(); 
        
        
        if(timer > timeToWaitUntilTick){
        
        
        getInput();
        move();
        
            
        timer = 0; 
        
        
        }
        
        
        
    }

    private void getInput() {

   
   
        
        
        xMove = 0;
        yMove = 0;
        if (game.getKeyManager().up) {
            yMove = -speed;
        }
        if (game.getKeyManager().down) {
            yMove = +speed;
        }
        if (game.getKeyManager().left) {
            xMove = -speed;
        }
        if (game.getKeyManager().right) {
            xMove = +speed;
        }

    
        
        
        
        
        
        
    }

    @Override
    public void render(Graphics g) {
        // hier statt barrel später Spiler IMG einfügen.
    
        
   
        
        
         g.drawImage(Assets.player, (int) x*Creatures.DEFAULT_CREATURE_HEIGHT, (int) y*Creatures.DEFAULT_CREATURE_WIDTH, width, height, null);
            

        
        
        
    }

}

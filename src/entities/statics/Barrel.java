/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.statics;

import gfx.Assets;
import java.awt.Graphics;
import pokemon.Handler;
import tiles.Tile;

/**
 *
 * @author Brehm
 */
public class Barrel extends StaticEntity {

    public Barrel(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);

        
    }

    
    
    
    
    @Override
    public void tick() {
  
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.barrelTopLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.barrelTopRight, (int) (x+Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.barrelBotLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.barrelBotRight, (int) (x+Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()) , width, height, null); 
    }
    
}

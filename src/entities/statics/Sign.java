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
public class Sign extends StaticEntity {

    public Sign(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
        bounds.x = 0; 
        bounds.y = 0; 
        bounds.width = Tile.TILEWIDTH*2; 
        bounds.height = Tile.TILEHEIGHT*2; 
        
    }

    
    
    
    
    @Override
    public void tick() {
  
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.signTopLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.signTopRight, (int) (x+Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.signBotLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.signBotRight, (int) (x+Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()) , width, height, null); 
    }
    
}

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
public class houseType1 extends StaticEntity{

    public houseType1(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
        bounds.x = 0; 
        bounds.y = 0; 
        bounds.width = Tile.TILEWIDTH*8; 
        bounds.height = Tile.TILEHEIGHT*6; 
    }

    @Override
    public void tick() {
      
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.house1RoofBackCornerLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()) , width, height, null);      
        g.drawImage(Assets.house1RoofBackLoweringToLeft, (int) (x+Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()) , width, height, null);        
        g.drawImage(Assets.house1RoofBackEdge, (int) (x+Tile.TILEWIDTH*2 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()) , width, height, null);
        g.drawImage(Assets.house1RoofBackEdge, (int) (x+Tile.TILEWIDTH*3 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.house1RoofBackEdge, (int) (x+Tile.TILEWIDTH*4 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()) , width, height, null);  
        g.drawImage(Assets.house1RoofBackEdge, (int) (x+Tile.TILEWIDTH*5 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()) , width, height, null);
        g.drawImage(Assets.house1RoofBackLoweringToRight, (int) (x+Tile.TILEWIDTH*6 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()) , width, height, null);
        g.drawImage(Assets.house1RoofBackCornerRight, (int) (x+Tile.TILEWIDTH*7 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()) , width, height, null);
        
        g.drawImage(Assets.house1RoofEgdeLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()) , width, height, null);   
        g.drawImage(Assets.house1RoofEdgeFrontLoweringStartLeftTop, (int) (x+Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()) , width, height, null);
        g.drawImage(Assets.houseRoofCornerFront, (int) (x+Tile.TILEWIDTH*2 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.houseRoofCornerFront, (int) (x+Tile.TILEWIDTH*3 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.houseRoofCornerFront, (int) (x+Tile.TILEWIDTH*4 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.houseRoofCornerFront, (int) (x+Tile.TILEWIDTH*5 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.house1RoofEdgeFrontLoweringStartRightTop, (int) (x+Tile.TILEWIDTH*6 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()) , width, height, null);
        g.drawImage(Assets.house1RoofEgdeRight, (int) (x+Tile.TILEWIDTH*7 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()) , width, height, null);   
        
       g.drawImage(Assets.house1RoofFrontCornerLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*2 - handler.getGameCamera().getyOffset()) , width, height, null);   
        g.drawImage(Assets.house1RoofEdgeFrontLoweringStartLeftBot, (int) (x+Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*2 - handler.getGameCamera().getyOffset()) , width, height, null);
        g.drawImage(Assets.window, (int) (x+Tile.TILEWIDTH*2 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*2 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.houseWall, (int) (x+Tile.TILEWIDTH*3 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*2 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.window, (int) (x+Tile.TILEWIDTH*4 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*2 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.window, (int) (x+Tile.TILEWIDTH*5 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*2 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.house1RoofEdgeFrontLoweringStartRightBot, (int) (x+Tile.TILEWIDTH*6 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*2 - handler.getGameCamera().getyOffset()) , width, height, null);
        g.drawImage(Assets.house1RoofFrontCornerRight, (int) (x+Tile.TILEWIDTH*7 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*2 - handler.getGameCamera().getyOffset()) , width, height, null); 
        
        g.drawImage(Assets.house2RoofCornerFrontLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*3 - handler.getGameCamera().getyOffset()) , width, height, null);   
        g.drawImage(Assets.houseRoofCornerFront, (int) (x+Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*3 - handler.getGameCamera().getyOffset()) , width, height, null);
        g.drawImage(Assets.houseRoofCornerFront, (int) (x+Tile.TILEWIDTH*2 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*3 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.houseRoofCornerFront, (int) (x+Tile.TILEWIDTH*3 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*3 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.houseRoofCornerFront, (int) (x+Tile.TILEWIDTH*4 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*3 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.houseRoofCornerFront, (int) (x+Tile.TILEWIDTH*5 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*3 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.houseRoofCornerFront, (int) (x+Tile.TILEWIDTH*6 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*3 - handler.getGameCamera().getyOffset()) , width, height, null);
        g.drawImage(Assets.house2RoofCornerFrontRight, (int) (x+Tile.TILEWIDTH*7 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*3 - handler.getGameCamera().getyOffset()) , width, height, null);  
        
        g.drawImage(Assets.houseWallLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*4 - handler.getGameCamera().getyOffset()) , width, height, null);   
        g.drawImage(Assets.houseWall, (int) (x+Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*4 - handler.getGameCamera().getyOffset()) , width, height, null);
        g.drawImage(Assets.doorTopLeft, (int) (x+Tile.TILEWIDTH*2 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*4 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.doorTopRight, (int) (x+Tile.TILEWIDTH*3 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*4 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.window, (int) (x+Tile.TILEWIDTH*4 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*4 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.window, (int) (x+Tile.TILEWIDTH*5 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*4 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.houseWall, (int) (x+Tile.TILEWIDTH*6 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*4 - handler.getGameCamera().getyOffset()) , width, height, null);
        g.drawImage(Assets.houseWallRight, (int) (x+Tile.TILEWIDTH*7 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*4 - handler.getGameCamera().getyOffset()) , width, height, null); 
        
         g.drawImage(Assets.houseWallFrontCornerLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*5 - handler.getGameCamera().getyOffset()) , width, height, null);   
        g.drawImage(Assets.house1WallBottom, (int) (x+Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*5 - handler.getGameCamera().getyOffset()) , width, height, null);
        g.drawImage(Assets.doorBotLeft, (int) (x+Tile.TILEWIDTH*2 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*5 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.doorBotRight, (int) (x+Tile.TILEWIDTH*3 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*5 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.house1WallBottom, (int) (x+Tile.TILEWIDTH*4 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*5 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.house1WallBottom, (int) (x+Tile.TILEWIDTH*5 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*5 - handler.getGameCamera().getyOffset()) , width, height, null); 
        g.drawImage(Assets.house1WallBottom, (int) (x+Tile.TILEWIDTH*6 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*5 - handler.getGameCamera().getyOffset()) , width, height, null);
        g.drawImage(Assets.houseWallFrontCornerRight, (int) (x+Tile.TILEWIDTH*7 - handler.getGameCamera().getxOffset()), (int) (y+Tile.TILEHEIGHT*5 - handler.getGameCamera().getyOffset()) , width, height, null);  
        
        
    }
    
}

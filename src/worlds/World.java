/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worlds;

import java.awt.Graphics;
import tiles.Tile;
import utils.Utils;

/**
 *
 * @author Brehm
 */
public class World {
    
    private int width, height; 
    private int spawnX, spawnY; 
    private int[][] tiles; 
    
    public World(String path){ 
        loadWorld(path);
    }
    
    public void tick(){
        
        
    }
    
    public void render(Graphics g){
        for(int y = 0 ; y < height ; y++){
            for(int x = 0 ; x < width; x++){
                getTile(x, y).render(g, x* Tile.TILEWIDTH, y* Tile.TILEHEIGHT);
            }
            
        }
    }
    
    
    public Tile getTile(int x , int y){ 
        Tile t = Tile.tiles[tiles[x][y]]; 
        if(t == null){ 
              return Tile.emptyTile; 
        }
          
        return t; 
        
        
    }
    
    
    
    
    
    
    private void loadWorld(String path){ 
        String file = Utils.loadFileAsString(path); 
        String[] tokens = file.split("\\s+"); 
        width = Utils.paseInt(tokens[0]); 
        height = Utils.paseInt(tokens[1]);
        spawnX = Utils.paseInt(tokens[2]); 
        spawnY = Utils.paseInt(tokens[3]); 
        
        
        tiles = new int[width][height]; 
        
        for(int y = 0; y < height ; y++){
            for(int x = 0; x < width; x++){ 
               tiles[x][y] =  Utils.paseInt(tokens[(x + y * width) + 4]); 
            }
            
        }
        
        
        
    }
    
}

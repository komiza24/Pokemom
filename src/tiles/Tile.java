/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Brehm
 */
public class Tile {
    
    // static stuff here 
    
    public static Tile[] tiles = new Tile[256]; 
    public static Tile emptyTile = new EmptyTile(0); 
    public static Tile pathTile = new PathTile(1); 
    public static Tile pathWithGrassTile = new PathWithGrass(2); 
    public static Tile grassTile = new GrassTile(3); 
   
    public static Tile barrelTopLeft = new BarrelTopLeft(4); 
    public static Tile barrelTopRight = new BarrelTopRight(5); 
    public static Tile barrelBotLeft = new BarrelBotLeft(6); 
    public static Tile barrelBotRight = new BarrelBotRight(7); 
   

    
    
    
    
    
    //class

    public static final int TILEWIDTH = 32, TILEHEIGHT = 32;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id) {

        this.texture = texture;
        this.id = id;
        tiles[id] = this; 
        

    }

    public void tick() {

    }

    public void render(Graphics g, int x, int y) {

        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);

    }

    
    public boolean isSolid(){
        return false; 
    }
    
    
    public int getId() {

        return id;

    }

}

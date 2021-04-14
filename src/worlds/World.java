package worlds;

import entities.EntityManager;
import entities.creatures.Player;
import entities.statics.Barrel;
import java.awt.Graphics;
import pokemon.Handler;
import tiles.Tile;
import utils.Utils;

public class World {

    private Handler handler;
    private int width, height;
    private int spawnX, spawnY;
    private int[][] tiles;

    // Entities
    private EntityManager entityManager;

 

    public World(Handler handler, String path) {
        this.handler = handler;

        entityManager = new EntityManager(handler, new Player(handler, 12, 10));
        
        
        // add Entities.  nur ganze Zahlen benutzen. 2 4 6 8 damit die Entity im 16x16 Raster bleibt (Map besteht aus 8x8 Tiles) entities sind aber unterschiedlich groß bestehen meistens aus einem oder mehreren 16x16 Tiles. 
        
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 2*Tile.TILEHEIGHT));
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 4*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 6*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 8*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 10*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 12*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 14*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 16*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 18*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 20*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 22*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 24*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 26*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 28*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 30*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 32*Tile.TILEHEIGHT)); 
        entityManager.addEntity(new Barrel(handler, 0*Tile.TILEWIDTH, 34*Tile.TILEHEIGHT)); 
        
        
        entityManager.addEntity(new Barrel(handler, 6*Tile.TILEWIDTH, 12*Tile.TILEHEIGHT));
         entityManager.addEntity(new Barrel(handler, 14*Tile.TILEWIDTH, 12*Tile.TILEHEIGHT));
         
         
         entityManager.addEntity(new Barrel(handler, 10*Tile.TILEWIDTH, 16*Tile.TILEHEIGHT));
        
         entityManager.addEntity(new Barrel(handler, 10*Tile.TILEWIDTH, 8*Tile.TILEHEIGHT));
        
        
        
        
        
        loadWorld(path);

        entityManager.getPlayer().setX(spawnX);
        entityManager.getPlayer().setY(spawnY);

    }

    public void tick() {
        entityManager.tick();
    }

    public void render(Graphics g) {
        int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
        int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
        int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
        int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);
        for (int y = yStart; y < yEnd; y++) {
            for (int x = xStart; x < xEnd; x++) {
                getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
            }
        }
        
        //Entities
        entityManager.render(g);
        
    }

    public Tile getTile(int x, int y) {

        if (x < 0 || y < 0 || x >= width || y >= height) {
            return Tile.emptyTile;
        }

        Tile t = Tile.tiles[tiles[x][y]];
        if (t == null) {
            return Tile.emptyTile;
        }
        return t;

    }

    private void loadWorld(String path) {
        String file = Utils.loadFileAsString(path);
        String[] tokens = file.split("\\s+");
        width = Utils.paseInt(tokens[0]);
        height = Utils.paseInt(tokens[1]);
        spawnX = Utils.paseInt(tokens[2]);
        spawnY = Utils.paseInt(tokens[3]);
        tiles = new int[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                tiles[x][y] = Utils.paseInt(tokens[(x + y * width) + 4]);
            }
        }
    }

       public EntityManager getEntityManager() {
        return entityManager;
    }
    
    
    
    
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states;

import entities.creatures.Player;
import java.awt.Graphics;
import pokemon.Game;
import worlds.World;

/**
 *
 * @author Brehm
 */
public class GameState extends State {
    
    private Player player; 
    private World world; 

    
    
    public GameState(Game game){ 
            super(game);
            player = new Player(game,0,0); 
            world = new World("res/worlds/world1.txt"); 
    }
    

    @Override
    public void tick() {
        world.tick();
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        
        
        
        player.render(g); 
  
        
        
        
    }
    
    
    
}

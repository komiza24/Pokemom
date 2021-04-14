/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.creatures.Player;
import java.awt.Graphics;
import java.util.ArrayList;
import pokemon.Handler;

/**
 *
 * @author Brehm
 */
public class EntityManager {

    private Handler handler;
    private Player player;
    private ArrayList<Entity> entities;

    public EntityManager(Handler handler, Player player) {
        this.handler = handler;
        this.player = player;
        entities = new ArrayList<>();
        addEntity(player);
    }

    public void tick() {
        for (int i = 0; i < entities.size(); i++) {
                Entity e = entities.get(i); 
                e.tick();
        }
    }

    public void render(Graphics g) {
        entities.forEach((e) -> {
            e.render(g);
        });      
    }

    public void addEntity(Entity e) {
        entities.add(e); 
    }

    // Getters and Setters
    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }

}

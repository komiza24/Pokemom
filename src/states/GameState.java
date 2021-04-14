package states;

import entities.creatures.Player;
import java.awt.Graphics;
import pokemon.Handler;
import worlds.World;

public class GameState extends State {

    private Player player;
    private World world;

    public GameState(Handler handler) {
        super(handler);
        world = new World(handler, "res/worlds/world1.txt");
        handler.setWorld(world);
        player = new Player(handler, 10, 12);
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

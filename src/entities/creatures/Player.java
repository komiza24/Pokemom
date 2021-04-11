package entities.creatures;

import gfx.Assets;
import java.awt.Graphics;
import pokemon.Handler;

public class Player extends Creatures {

    private long lastTime, timer;
    private int timeToWaitUntilTick;

    public Player(Handler handler, float x, float y) {
        super(handler, x, y, Creatures.DEFAULT_CREATURE_WIDTH, Creatures.DEFAULT_CREATURE_HEIGHT);
        // timer 
        timer = 0;
        lastTime = System.currentTimeMillis();
        timeToWaitUntilTick = 400;
    }

    @Override
    public void tick() {
        timer += System.currentTimeMillis() - lastTime;
        lastTime = System.currentTimeMillis();
        if (timer > timeToWaitUntilTick) {
            getInput();
            move();
            timer = 0;
        }
        handler.getGameCamera().centerOnEntity(this);
    }

    private void getInput() {
        xMove = 0;
        yMove = 0;
        if (handler.getKeyManager().up && !handler.getKeyManager().down && !handler.getKeyManager().left && !handler.getKeyManager().right) {
            yMove = -speed;
        }
        if (handler.getKeyManager().down && !handler.getKeyManager().up && !handler.getKeyManager().left && !handler.getKeyManager().right) {
            yMove = +speed;
        }
        if (handler.getKeyManager().left && !handler.getKeyManager().right && !handler.getKeyManager().down && !handler.getKeyManager().up) {
            xMove = -speed;
        }
        if (handler.getKeyManager().right && !handler.getKeyManager().left && !handler.getKeyManager().down && !handler.getKeyManager().up) {
            xMove = +speed;
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
    }

}

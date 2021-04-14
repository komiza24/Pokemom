package entities.creatures;

import gfx.Animation;
import gfx.Assets;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import pokemon.Handler;
import tiles.Tile;

public class Player extends Creatures {

    //animations
    private Animation animDown, animUp, animRight, animLeft;
    private int direktion;

    public Player(Handler handler, float x, float y) {
        super(handler, x, y, Creatures.DEFAULT_CREATURE_WIDTH, Creatures.DEFAULT_CREATURE_HEIGHT);
        
      
        

        // animations                       Time to wait = time to wait until get next input my keymanager so läuft die animation genau 1 mal pro Tile(Feld 16x16 micht 8x8 ! )
        animDown = new Animation(175, Assets.player_down);
        animUp = new Animation(175, Assets.player_up);
        animRight = new Animation(175, Assets.player_right);
        animLeft = new Animation(175, Assets.player_left);

    }

    @Override
    public void tick() {

        //animations
        animRight.tick();
        animLeft.tick();
        animDown.tick();
        animUp.tick();

        getInput();

        //movement
        move();

        handler.getGameCamera().centerOnEntity(this);
    }

    private void getInput() {
        xMove = 0;
        yMove = 0;

        if (handler.getKeyManager().up && !handler.getKeyManager().down && !handler.getKeyManager().left && !handler.getKeyManager().right) {

            yMove = -speed;
            direktion = 1;
        }
        if (handler.getKeyManager().down && !handler.getKeyManager().up && !handler.getKeyManager().left && !handler.getKeyManager().right) {
            yMove = +speed;
            direktion = 4;
        }
        if (handler.getKeyManager().left && !handler.getKeyManager().right && !handler.getKeyManager().down && !handler.getKeyManager().up) {

            xMove = -speed;
            direktion = 3;

        }
        if (handler.getKeyManager().right && !handler.getKeyManager().left && !handler.getKeyManager().down && !handler.getKeyManager().up) {

            xMove = +speed;
            direktion = 2;

        }

    }

    @Override
    public void render(Graphics g) {

        g.drawImage(getCurrentAnimationFrame(), (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), width, height, null);
        
        
        // HitBox Rectagle  :D 
        
        /*
        g.setColor(Color.RED);
        g.fillRect((int) (x * Tile.TILEWIDTH + bounds.x - handler.getGameCamera().getxOffset()),
                (int) (y * Tile.TILEHEIGHT + bounds.y - handler.getGameCamera().getyOffset()),
                bounds.width, bounds.height);
          */    
    }

    private BufferedImage getCurrentAnimationFrame() {

        if (xMove < 0) {
            return animLeft.getCurrentFrame();
        } else if (xMove > 0) {
            return animRight.getCurrentFrame();
        } else if (yMove < 0) {
            return animUp.getCurrentFrame();
        } else if (yMove > 0) {
            return animDown.getCurrentFrame();
        } else {

            
            
            
            
           
            switch (direktion) {
                case 1:
                    return Assets.player_default_up;
                case 2:
                    return Assets.player_default_right;
                case 3:
                    return Assets.player_default_left;
                default:
                    return Assets.player_default_down;
            }
           
        }

    }

}

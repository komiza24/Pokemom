package entities.creatures;

import gfx.Animation;
import gfx.Assets;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import pokemon.Handler;

public class Player extends Creatures {

    //animations
    private Animation animDown, animUp, animRight, animLeft; 
    private int direktion; 
    
    
    private long lastTime, timer;
    private int timeToWaitUntilTick;

    public Player(Handler handler, float x, float y) {
        super(handler, x, y, Creatures.DEFAULT_CREATURE_WIDTH, Creatures.DEFAULT_CREATURE_HEIGHT);
        // timer 
        timer = 0;
        lastTime = System.currentTimeMillis();
        timeToWaitUntilTick = 400;
        
        
        
        // animations
        animDown = new Animation(400, Assets.player_down); 
        animUp = new Animation(400, Assets.player_up);
        animRight = new Animation(300, Assets.player_right);
        animLeft = new Animation(300, Assets.player_left);
        
        
    }

    @Override
    public void tick() {
        timer += System.currentTimeMillis() - lastTime;
        lastTime = System.currentTimeMillis();
        //animations
            animDown.tick();
            animUp.tick();
            animRight.tick();
            animLeft.tick();
        if (timer > timeToWaitUntilTick) {
            //movement
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
            animUp.tick();
            direktion = 1; 
        }
        if (handler.getKeyManager().down && !handler.getKeyManager().up && !handler.getKeyManager().left && !handler.getKeyManager().right) {
            yMove = +speed;
            animDown.tick();
            direktion = 2; 
        }
        if (handler.getKeyManager().left && !handler.getKeyManager().right && !handler.getKeyManager().down && !handler.getKeyManager().up) {
            xMove = -speed;
            direktion = 3; 
        }
        if (handler.getKeyManager().right && !handler.getKeyManager().left && !handler.getKeyManager().down && !handler.getKeyManager().up) {
            xMove = +speed;
            direktion = 4; 
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
    }

    
    private BufferedImage getCurrentAnimationFrame(){ 
     
        
        if (xMove < 0) {
            return animLeft.getCurrentFrame(); 
        }else if (xMove > 0 ) {
            return animRight.getCurrentFrame(); 
        }else if(yMove < 0 ){ 
            return animUp.getCurrentFrame(); 
        }else if(yMove > 0){ 
            return animDown.getCurrentFrame(); 
        }else{
            
            
            switch (direktion) {
                case 1:
                    return Assets.player_default_up;
                case 2:
                    return Assets.player_default_down;
                case 3:
                    return Assets.player_default_left;
                default: 
                    return Assets.player_default_right;
            }
            
          
            
            
            
            
            
        }
        
        
    }
    
    
    
}

package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

    private boolean[] keys;
    public boolean up, down, left, right;
    
    private long lastTime, timer;
    private float timeToWaitUntilTick;

    public KeyManager() {
        keys = new boolean[256];
        timer = 0;
        lastTime = System.currentTimeMillis();
        timeToWaitUntilTick = 260f ;  
                

    }

    public void tick() {
        
        timer += System.currentTimeMillis() - lastTime;
        lastTime = System.currentTimeMillis();
        
        
         if (timer > timeToWaitUntilTick) {


        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_D];
        
        
       timer = 0 ;  
       
      }
        
    
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

}

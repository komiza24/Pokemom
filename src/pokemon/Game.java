/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import display.Display;
import gfx.Assets;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import input.KeyManager;
import states.GameState;
import states.MenuState;
import states.State;

public class Game implements Runnable {

    private Display display;
    public int width, height;
    public String title;

    private Thread thread;
    private boolean running = false;

    private BufferStrategy bs;
    private Graphics g;

    // states ! 
    private State gameState;
    private State menuState;
    
    // Input
    private KeyManager keyManager; 
    
    
    
// konstruktor 
    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
        keyManager = new KeyManager(); 
    }

    // Alles vor dem start initalisieren.
    private void init() {
        display = new Display(title, width, height);
        
        display.getFrame().addKeyListener(keyManager);
        
        Assets.init();

        gameState = new GameState(this);
        menuState = new MenuState(this);
        State.setState(gameState);
    }

    private void update() {
         keyManager.tick();
        
        
        if (State.getState() != null) {
            State.getState().tick();

        }
    }


    
    
    private void render() {
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();    // create the paintbrush ! 

        // clear screen here
        g.clearRect(0, 0, width, height);
        // Start drawing

        if (State.getState() != null) {
            State.getState().render(g);
        }

   
        
   



        // End drawing 
        bs.show();
        g.dispose();

    }

    @Override
    public void run() {
        init();

        // so viele ticks in einer sec
        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();

        // game loop wenn running true läuft es immer und immer wieder! 
        while (running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            lastTime = now;

            if (delta >= 1) {
                update();
                render();
                delta--;
            }

        }
        // Thread nochmal stoppen falls aus i einem Grund nicht beendet wurde.
        stop();

    }

    
    public KeyManager getKeyManager(){ 
        return keyManager; 
    }
    
    
    
    
    
    
    
    
    public synchronized void start() {
        if (running) {
            return;
        }
        running = true;
        thread = new Thread(this);   // this bezieht sich hier auf die Klasse !   Thread wird auf die Klasse Game bezogen also this class.
        thread.start(); // Ruft die run Methode auf !
    }

    public synchronized void stop() {
        if (!running) {
            return;
        }
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

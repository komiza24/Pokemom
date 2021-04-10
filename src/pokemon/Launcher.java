/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import display.*;


public class Launcher {

    public static void main(String[] args) {

        Game game = new Game("Title",1280,1152);
        game.start();

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiles;

import gfx.Assets;
import java.awt.image.BufferedImage;

/**
 *
 * @author Brehm
 */
public class BarrelTopRight extends Tile{
    
    public BarrelTopRight(int id) {
        super(Assets.barrelTopRight, id);
    }
        @Override
       public boolean isSolid(){
        return true; 
    }
}

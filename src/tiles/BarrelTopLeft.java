/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiles;

import gfx.Assets;

/**
 *
 * @author Brehm
 */
public class BarrelTopLeft extends Tile
{
    
    public BarrelTopLeft( int id) {
        super(Assets.barrelTopLeft, id);
    }
        @Override
       public boolean isSolid(){
        return true; 
    }
}

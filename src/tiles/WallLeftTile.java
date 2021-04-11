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
public class WallLeftTile extends Tile{
    
    public WallLeftTile(int id) {
        super(Assets.wallLeft, id);
    }
        @Override
        public boolean isSolid(){
        return true; 
    }
}

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
public class WallTopTile extends Tile{
    
    public WallTopTile( int id) {
        super(Assets.wallTop, id);
    }
    @Override
        public boolean isSolid(){
        return true; 
    }
}

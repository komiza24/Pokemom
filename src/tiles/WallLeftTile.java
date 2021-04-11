package tiles;

import gfx.Assets;

public class WallLeftTile extends Tile{
    
    public WallLeftTile(int id) {
        super(Assets.wallLeft, id);
    }
        @Override
        public boolean isSolid(){
        return true; 
    }
}

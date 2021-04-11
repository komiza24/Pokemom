package tiles;

import gfx.Assets;

public class WallTopTile extends Tile {

    public WallTopTile(int id) {
        super(Assets.wallTop, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}

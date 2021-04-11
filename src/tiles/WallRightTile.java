package tiles;

import gfx.Assets;

public class WallRightTile extends Tile {

    public WallRightTile(int id) {
        super(Assets.wallRight, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}

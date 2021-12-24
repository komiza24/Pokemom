/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.statics;

import gfx.Assets;
import java.awt.Graphics;
import pokemon.Handler;
import tiles.Tile;

/**
 *
 * @author Brehm
 */
public class OaksLab extends StaticEntity {

    public OaksLab(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
        bounds.x = 0;
        bounds.y = 0;
        bounds.width = Tile.TILEWIDTH * 12;
        bounds.height = Tile.TILEHEIGHT * 8;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        //row 1
        g.drawImage(Assets.house1RoofBackCornerLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofBackLoweringToLeft, (int) (x + Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2RoofEdgeBack, (int) (x + Tile.TILEWIDTH * 2 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2RoofEdgeBack, (int) (x + Tile.TILEWIDTH * 3 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2RoofEdgeBack, (int) (x + Tile.TILEWIDTH * 4 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2RoofEdgeBack, (int) (x + Tile.TILEWIDTH * 5 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2RoofEdgeBack, (int) (x + Tile.TILEWIDTH * 6 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2RoofEdgeBack, (int) (x + Tile.TILEWIDTH * 7 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2RoofEdgeBack, (int) (x + Tile.TILEWIDTH * 8 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2RoofEdgeBack, (int) (x + Tile.TILEWIDTH * 9 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofBackLoweringToRight, (int) (x + Tile.TILEWIDTH * 10 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofBackCornerRight, (int) (x + Tile.TILEWIDTH * 11 - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
        //row 2
        g.drawImage(Assets.house1RoofEgdeLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofSide, (int) (x + Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 2 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 3 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 4 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 5 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 6 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 7 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 8 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 9 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofSide, (int) (x + Tile.TILEWIDTH * 10 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofEgdeRight, (int) (x + Tile.TILEWIDTH * 11 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), width, height, null);
        //row 3 
        g.drawImage(Assets.house1RoofEgdeLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 2 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofSide, (int) (x + Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 2 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 2 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 2 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 3 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 2 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 4 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 2 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 5 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 2 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 6 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 2 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 7 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 2 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 8 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 2 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house2Roof, (int) (x + Tile.TILEWIDTH * 9 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 2 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofSide, (int) (x + Tile.TILEWIDTH * 10 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 2 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofEgdeRight, (int) (x + Tile.TILEWIDTH * 11 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 2 - handler.getGameCamera().getyOffset()), width, height, null);
        //row 4
        g.drawImage(Assets.house1RoofEgdeLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 3 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofEdgeFrontLoweringStartLeftTop, (int) (x + Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 3 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseRoofCornerFront, (int) (x + Tile.TILEWIDTH * 2 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 3 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseRoofCornerFront, (int) (x + Tile.TILEWIDTH * 3 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 3 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseRoofCornerFront, (int) (x + Tile.TILEWIDTH * 4 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 3 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseRoofCornerFront, (int) (x + Tile.TILEWIDTH * 5 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 3 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseRoofCornerFront, (int) (x + Tile.TILEWIDTH * 6 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 3 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseRoofCornerFront, (int) (x + Tile.TILEWIDTH * 7 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 3 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseRoofCornerFront, (int) (x + Tile.TILEWIDTH * 8 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 3 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseRoofCornerFront, (int) (x + Tile.TILEWIDTH * 9 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 3 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofEdgeFrontLoweringStartRightTop, (int) (x + Tile.TILEWIDTH * 10 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 3 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofEgdeRight, (int) (x + Tile.TILEWIDTH * 11 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 3 - handler.getGameCamera().getyOffset()), width, height, null);
        //row 5
        g.drawImage(Assets.house1RoofFrontCornerLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 4 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofEdgeFrontLoweringStartLeftBot, (int) (x + Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 4 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH * 2 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 4 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH * 3 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 4 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH * 4 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 4 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWallBricks, (int) (x + Tile.TILEWIDTH * 5 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 4 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWallBricks, (int) (x + Tile.TILEWIDTH * 6 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 4 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH * 7 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 4 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH * 8 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 4 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH * 9 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 4 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofEdgeFrontLoweringStartRightBot, (int) (x + Tile.TILEWIDTH * 10 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 4 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1RoofFrontCornerRight, (int) (x + Tile.TILEWIDTH * 11 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 4 - handler.getGameCamera().getyOffset()), width, height, null);
        //row 6
        g.drawImage(Assets.houseWallLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 5 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWall, (int) (x + Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 5 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWall, (int) (x + Tile.TILEWIDTH * 2 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 5 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWall, (int) (x + Tile.TILEWIDTH * 3 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 5 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWallBricks, (int) (x + Tile.TILEWIDTH * 4 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 5 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWallBricks, (int) (x + Tile.TILEWIDTH * 5 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 5 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWallBricks, (int) (x + Tile.TILEWIDTH * 6 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 5 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWallBricks, (int) (x + Tile.TILEWIDTH * 7 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 5 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWallBricks, (int) (x + Tile.TILEWIDTH * 8 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 5 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWallBricks, (int) (x + Tile.TILEWIDTH * 9 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 5 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWallBricks, (int) (x + Tile.TILEWIDTH * 10 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 5 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWallRight, (int) (x + Tile.TILEWIDTH * 11 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 5 - handler.getGameCamera().getyOffset()), width, height, null);
        //row 7
        g.drawImage(Assets.houseWallLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 6 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 6 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH * 2 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 6 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH * 3 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 6 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.doorTopLeft, (int) (x + Tile.TILEWIDTH * 4 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 6 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.doorTopRight, (int) (x + Tile.TILEWIDTH * 5 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 6 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH * 6 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 6 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH * 7 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 6 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH * 8 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 6 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH * 9 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 6 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.window, (int) (x + Tile.TILEWIDTH * 10 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 6 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWallRight, (int) (x + Tile.TILEWIDTH * 11 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 6 - handler.getGameCamera().getyOffset()), width, height, null);
        //row 8
        g.drawImage(Assets.houseWallFrontCornerLeft, (int) (x - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 7 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1WallBottom, (int) (x + Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 7 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1WallBottom, (int) (x + Tile.TILEWIDTH * 2 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 7 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1WallBottom, (int) (x + Tile.TILEWIDTH * 3 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 7 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.doorBotLeft, (int) (x + Tile.TILEWIDTH * 4 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 7 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.doorBotRight, (int) (x + Tile.TILEWIDTH * 5 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 7 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1WallBottom, (int) (x + Tile.TILEWIDTH * 6 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 7 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1WallBottom, (int) (x + Tile.TILEWIDTH * 7 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 7 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1WallBottom, (int) (x + Tile.TILEWIDTH * 8 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 7 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1WallBottom, (int) (x + Tile.TILEWIDTH * 9 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 7 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.house1WallBottom, (int) (x + Tile.TILEWIDTH * 10 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 7 - handler.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(Assets.houseWallFrontCornerRight, (int) (x + Tile.TILEWIDTH * 11 - handler.getGameCamera().getxOffset()), (int) (y + Tile.TILEHEIGHT * 7 - handler.getGameCamera().getyOffset()), width, height, null);
        
    }

}

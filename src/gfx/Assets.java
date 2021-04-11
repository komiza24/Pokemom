package gfx;

import java.awt.image.BufferedImage;

public class Assets {

    // Kleinst mögliche größe des grids in den Sprite Sheets. 
    // Bei größeren muss skaliert werden !!!!
    private static final int width = 8, height = 8;
    public static BufferedImage player, path, mountainTopBackEdge, mountainBackEdgeLoweringToRight, flower, bridge, house1RoofBackCornerLeft, house1RoofBackLoweringToLeft, house1RoofBackEdge,
            house1RoofBackLoweringToRight, house1RoofBackCornerRight, window, doorTopLeft, doorTopRight, empty, fenceTop, houseWallLeft, bicycleFenceVertical, mountainTop, house2Roof, unknown1,
            water, house1RoofEgdeLeft, house1RoofEdgeFrontLoweringStartLeftTop, houseRoofCornerFront, house1RoofEdgeFrontLoweringStartRightTop, house1RoofEgdeRight, house1WallBottom, doorBotLeft,
            doorBotRight, unknown2, mountainBackEdgeLoweringToLeft, houseWallRight, bicycleFenceHorizontal, bicycleFenceCorner, houseWall, unknown3, mountainFrontLoweringEdgeRight, house1RoofFrontCornerLeft,
            house1RoofEdgeFrontLoweringStartLeftBot, wallThickRight, house1RoofEdgeFrontLoweringStartRightBot, house1RoofFrontCornerRight, barrelTopLeft, barrelTopRight, grass, treeCutableLeftTop,
            treeCutableRightTop, houseGymFontLeft, bridgeFloor, bridgePillar, wallLeft, wallTop, mouintainFrontLoweringEdgeRight, wallThickLeftTopCorner, mouintainFrontLoweringEdgeLeft, mountainFront,
            house1RoofSide, pathWithGrass, barrelBotLeft, barrelBotRight, unknown4, treeCutableLeftBot, treeCutableRightBot, houseGymFontRight, treeLeftTop, treeRightTop, signFontPokeLeft, signFontPokeRight,
            signFontMarktLeft, signFontMarktRight, signTopLeft, signTopRight, mountainEnterenceTopLeft, mountainEnterenceTopRight, signPillar, houseWallBricks, house2RoofCornerBackLeft, house2RoofCornerBackRight,
            houseWallFrontCornerLeft, houseWallFrontCornerRight, treeLeftBot, treeRightBot, grassHigh, house2RoofEdgeBack, wallRight, fenceBot, signBotLeft, signBotRight, mountainEnterenceBotLeft,
            mountainEnterenceBotRight, house2RoofSideEdge, pathWithStone, house2RoofCornerFrontLeft, house2RoofCornerFrontRight, unknown5, unknown6;

    public static void init() {
        SpriteSheet mainPlayer16x16 = new SpriteSheet(ImageLoader.loadImage("/textures/mainPlayerSheet16x16.gif"));
        SpriteSheet backgroudTiles8x8 = new SpriteSheet(ImageLoader.loadImage("/textures/backgoundTiles8x8.gif"));
        SpriteSheet tileSet_1 = new SpriteSheet(ImageLoader.loadImage("/textures/tileSet1_8x8.gif"));

        player = mainPlayer16x16.crop(width * 2, 0, width * 2, height * 2);

        // erste Spalte von tileSet1_8x8
        path = tileSet_1.crop(0, 0, width, height);
        mountainTopBackEdge = tileSet_1.crop(width, 0, width, height);
        mountainBackEdgeLoweringToRight = tileSet_1.crop(width * 2, 0, width, height);
        flower = tileSet_1.crop(width * 3, 0, width, height);
        bridge = tileSet_1.crop(width * 4, 0, width, height);
        house1RoofBackCornerLeft = tileSet_1.crop(width * 5, 0, width, height);
        house1RoofBackLoweringToLeft = tileSet_1.crop(width * 6, 0, width, height);
        house1RoofBackEdge = tileSet_1.crop(width * 7, 0, width, height);
        house1RoofBackLoweringToRight = tileSet_1.crop(width * 8, 0, width, height);
        house1RoofBackCornerRight = tileSet_1.crop(width * 9, 0, width, height);
        window = tileSet_1.crop(width * 10, 0, width, height);
        doorTopLeft = tileSet_1.crop(width * 11, 0, width, height);
        doorTopRight = tileSet_1.crop(width * 12, 0, width, height);
        empty = tileSet_1.crop(width * 13, 0, width, height);
        fenceTop = tileSet_1.crop(width * 14, 0, width, height);
        houseWallLeft = tileSet_1.crop(width * 15, 0, width, height);

        // zweite Spalte von tileSet1_8x8
        bicycleFenceVertical = tileSet_1.crop(0, 0, width, height);
        mountainTop = tileSet_1.crop(width, height, width, height);
        house2Roof = tileSet_1.crop(width * 2, height, width, height);
        unknown1 = tileSet_1.crop(width * 3, height, width, height);
        water = tileSet_1.crop(width * 4, height, width, height);
        house1RoofEgdeLeft = tileSet_1.crop(width * 5, height, width, height);
        house1RoofEdgeFrontLoweringStartLeftTop = tileSet_1.crop(width * 6, height, width, height);
        houseRoofCornerFront = tileSet_1.crop(width * 7, height, width, height);
        house1RoofEdgeFrontLoweringStartRightTop = tileSet_1.crop(width * 8, height, width, height);
        house1RoofEgdeRight = tileSet_1.crop(width * 9, height, width, height);
        house1WallBottom = tileSet_1.crop(width * 10, height, width, height);
        doorBotLeft = tileSet_1.crop(width * 11, height, width, height);
        doorBotRight = tileSet_1.crop(width * 12, height, width, height);
        unknown2 = tileSet_1.crop(width * 13, height, width, height);
        mountainBackEdgeLoweringToLeft = tileSet_1.crop(width * 14, height, width, height);
        houseWallRight = tileSet_1.crop(width * 15, height, width, height);

        // dritte Spalte von tileSet1_8x8
        bicycleFenceHorizontal = tileSet_1.crop(0, height * 2, width, height);
        bicycleFenceCorner = tileSet_1.crop(width, height * 2, width, height);
        houseWall = tileSet_1.crop(width * 2, height * 2, width, height);
        unknown3 = tileSet_1.crop(width * 3, height * 2, width, height);
        mountainFrontLoweringEdgeRight = tileSet_1.crop(width * 4, height * 2, width, height);
        house1RoofFrontCornerLeft = tileSet_1.crop(width * 5, height * 2, width, height);
        house1RoofEdgeFrontLoweringStartLeftBot = tileSet_1.crop(width * 6, height * 2, width, height);
        wallThickRight = tileSet_1.crop(width * 7, height * 2, width, height);
        house1RoofEdgeFrontLoweringStartRightBot = tileSet_1.crop(width * 8, height * 2, width, height);
        house1RoofFrontCornerRight = tileSet_1.crop(width * 9, height * 2, width, height);
        barrelTopLeft = tileSet_1.crop(width * 10, height * 2, width, height);
        barrelTopRight = tileSet_1.crop(width * 11, height * 2, width, height);
        grass = tileSet_1.crop(width * 12, height * 2, width, height);
        treeCutableLeftTop = tileSet_1.crop(width * 13, height * 2, width, height);
        treeCutableRightTop = tileSet_1.crop(width * 14, height * 2, width, height);
        houseGymFontLeft = tileSet_1.crop(width * 15, height * 2, width, height);

        //vierte Spalte von tileSet1_8x8
        bridgeFloor = tileSet_1.crop(0, height * 3, width, height);
        bridgePillar = tileSet_1.crop(width, height * 3, width, height);
        wallLeft = tileSet_1.crop(width * 2, height * 3, width, height);
        wallTop = tileSet_1.crop(width * 3, height * 3, width, height);
        mouintainFrontLoweringEdgeRight = tileSet_1.crop(width * 4, height * 3, width, height);
        wallThickLeftTopCorner = tileSet_1.crop(width * 5, height * 3, width, height);
        mouintainFrontLoweringEdgeLeft = tileSet_1.crop(width * 6, height * 3, width, height);
        mountainFront = tileSet_1.crop(width * 7, height * 3, width, height);
        house1RoofSide = tileSet_1.crop(width * 8, height * 3, width, height);
        pathWithGrass = tileSet_1.crop(width * 9, height * 3, width, height);
        barrelBotLeft = tileSet_1.crop(width * 10, height * 3, width, height);
        barrelBotRight = tileSet_1.crop(width * 11, height * 3, width, height);
        unknown4 = tileSet_1.crop(width * 12, height * 3, width, height);
        treeCutableLeftBot = tileSet_1.crop(width * 13, height * 3, width, height);
        treeCutableRightBot = tileSet_1.crop(width * 14, height * 3, width, height);
        houseGymFontRight = tileSet_1.crop(width * 15, height * 3, width, height);

        //fünfte Spalte von tileSet1_8x8
        treeLeftTop = tileSet_1.crop(0, height * 4, width, height);
        treeRightTop = tileSet_1.crop(width, height * 4, width, height);
        signFontPokeLeft = tileSet_1.crop(width * 2, height * 4, width, height);
        signFontPokeRight = tileSet_1.crop(width * 3, height * 4, width, height);
        signFontMarktLeft = tileSet_1.crop(width * 4, height * 4, width, height);
        signFontMarktRight = tileSet_1.crop(width * 5, height * 4, width, height);
        signTopLeft = tileSet_1.crop(width * 6, height * 4, width, height);
        signTopRight = tileSet_1.crop(width * 7, height * 4, width, height);
        mountainEnterenceTopLeft = tileSet_1.crop(width * 8, height * 4, width, height);
        mountainEnterenceTopRight = tileSet_1.crop(width * 9, height * 4, width, height);
        signPillar = tileSet_1.crop(width * 10, height * 4, width, height);
        houseWallBricks = tileSet_1.crop(width * 11, height * 4, width, height);
        house2RoofCornerBackLeft = tileSet_1.crop(width * 12, height * 4, width, height);
        house2RoofCornerBackRight = tileSet_1.crop(width * 13, height * 4, width, height);
        houseWallFrontCornerLeft = tileSet_1.crop(width * 14, height * 4, width, height);
        houseWallFrontCornerRight = tileSet_1.crop(width * 15, height * 4, width, height);

        //sechte Spalte von tileSet1_8x8
        treeLeftBot = tileSet_1.crop(0, height * 5, width, height);
        treeRightBot = tileSet_1.crop(width, height * 5, width, height);
        grassHigh = tileSet_1.crop(width * 2, height * 5, width, height);
        house2RoofEdgeBack = tileSet_1.crop(width * 3, height * 4, width, height);
        wallRight = tileSet_1.crop(width * 4, height * 5, width, height);
        fenceBot = tileSet_1.crop(width * 5, height * 5, width, height);
        signBotLeft = tileSet_1.crop(width * 6, height * 5, width, height);
        signBotRight = tileSet_1.crop(width * 7, height * 5, width, height);
        mountainEnterenceBotLeft = tileSet_1.crop(width * 8, height * 5, width, height);
        mountainEnterenceBotRight = tileSet_1.crop(width * 9, height * 5, width, height);
        house2RoofSideEdge = tileSet_1.crop(width * 10, height * 5, width, height);
        pathWithStone = tileSet_1.crop(width * 11, height * 5, width, height);
        house2RoofCornerFrontLeft = tileSet_1.crop(width * 12, height * 5, width, height);
        house2RoofCornerFrontRight = tileSet_1.crop(width * 13, height * 5, width, height);
        unknown5 = tileSet_1.crop(width * 14, height * 5, width, height);
        unknown6 = tileSet_1.crop(width * 15, height * 5, width, height);
    }

}

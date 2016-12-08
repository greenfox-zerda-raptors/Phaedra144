import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ${SzilviaB} on 2016. 12. 07..
 */
public class Area extends GameObject {




    ArrayList<Tile> tiles;
    int[][] map = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 0, 0, 1, 0, 1},
            {0, 1, 0, 0, 1, 0, 1, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0, 1, 1},
            {0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 1, 0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
            {0, 1, 1, 0, 1, 0, 0, 0, 0, 0},

    };


    public Area() {
        tiles = new ArrayList<Tile>();
        for (int k = 0; k < map.length; k++) {
            for (int j = 0; j < map[k].length; j++) {
                if (map[k][j] == 1) {
                    Wall wall = new Wall(j, k);
                    tiles.add(wall);
                } else {
                    Floor floor = new Floor(j, k);
                    tiles.add(floor);
                }

            }

        }
    }




    @Override
    public void draw(Graphics graphics) {
        for (GameObject item : tiles) {
            item.draw(graphics);
        }

    }

    public int getPosition(int x, int y) {
        try {
            if (map[y][x] == 0) {
                return 0;
            } else {
                return 1;
            }

        } catch (IndexOutOfBoundsException e) {
            return 1;
        }

    }

//    public int getPosOfCharacter (Character tempChar){
//        int x = 0;
//        x = map.length * tempChar.getPosY() + tempChar.getPosX();
//      return x;    }
}

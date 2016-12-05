import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by ${SzilviaB} on 2016. 12. 05..
 */
public class Board extends JPanel {
    ArrayList<Tile> tiles;
    boolean[][]map = new boolean[][]{
            {true, false, false, false},
            {true, false, false, false},
            {true, false, true, true}
    };


    public Board() {
        tiles = new ArrayList<Tile>();
        for (int k = 0; k < map.length; k++) {
            for (int j = 0; j < map[k].length; j++) {
                String imagename = "floor.png";
                String wallImage = "wall.png";
                if (map[k][j]){
                    Tile wall = new Tile(wallImage, k, j);
                    tiles.add(wall);
                }
                else {
                    Tile image = new Tile(imagename, k, j);
                    tiles.add(image);
                }

            }

        }

        this.setPreferredSize(new Dimension(720, 720));
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
//        super.paint(graphics);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        for (Tile tile : tiles) {
            tile.draw(graphics);

        }

    }
}


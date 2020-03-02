package firstGame;

import java.awt.*;

public class MapGenerator {
    public int map[][];
    public int brickWeight;
    public int brickHeight;
    public MapGenerator(int row, int col) {
        map = new int[row][col];
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                map[i][j] = 1;
            }
        }

        brickWeight = 540/col;
        brickHeight = 150/row;
    }


    public void draw(Graphics2D g) {
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(map[i][j] > 0){
                    g.setColor(Color.white);
                    g.fillRect(j * brickWeight + 80, i* brickHeight + 50, brickWeight-10, brickHeight-10);
                }
            }
        }
    }

    public void setBrickValue(int value, int row, int col) {
        map[row][col] = value;
    }


}

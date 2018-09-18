package java.com.example.kdail_000.nicholas_kurt_ttt;

/**
 * Created by kdail_000 on 9/12/2018.
 */

public class Grid
{
    //Figure out where to put this thing, until then just call Grid.gridSpace or import or whatever
    enum gridSpace{
        X, BLANK, O;
    }

    gridSpace[][] gameBoard;

    public boolean setTile(int x, int y, gridSpace gS) {
        if (0 < x < 2 && 0 < y < 2) {

        }
        return false;
    }

    public gridSpace getTileData(int x, int y) {
        return gridSpace[x][y];
    }

    public Grid() {
        gameBoard = new gridSpace[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = gridSpace.BLANK;
            }
        }
    }
}

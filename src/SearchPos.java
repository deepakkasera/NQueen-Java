/**
 * Created by deepak on 15/5/17.
 */
public class SearchPos {
    static int n = 4; // n is the size of queen board
    public static void guessPos(int x,int y,int[][] queenBoard){
        while(y < n){
            queenBoard[x][y]=1;
            if(LegalMoves.possibleQueen(x*n+y,queenBoard)){
                if(x+1 == n){
                    //solution has been found
                    return;
                }
                guessPos(x+1,0,queenBoard);
            }
            queenBoard[x][y]=0;
            y++;
        }
    }
}

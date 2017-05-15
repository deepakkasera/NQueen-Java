/**
 * Created by deepak on 15/5/17.
 */
public class LegalMoves {
    //variable i represents the position of last queen placed
    public static boolean possibleQueen(int i,int[][] queenBoard)
    {
        int row = i / SearchPos.n;
        int col = i % SearchPos.n;
        int temp = 1;
        try { // up left move
            while(queenBoard[row-temp][col-temp] == 0){
                temp++;
            }
            if(queenBoard[row-temp][col-temp] == 1)
                return false;
        }catch (Exception e){

        }
        temp = 1;
        try {  // up right move
            while(queenBoard[row-temp][col+temp] == 0){
                temp++;
            }
            if(queenBoard[row-temp][col+temp] == 1)
                return false;
        }catch (Exception e){

        }
        temp = 1;
        try { // up move
            while(queenBoard[row-temp][col] == 0){
                temp++;
            }
            if(queenBoard[row-temp][col] == 1)
                return false;
        }catch (Exception e) {

        }
        return true;
    }
}


import java.util.*;
class Sudokugame{

    int board[][];

    final int dimension=3;

    Sudokugame(int[][] board){
        this.board=board;
    }

    public void print(){
        for(int row=0;row<board.length;row++){
            if(row%dimension==0)    System.out.println();
            for(int column=0;column<board.length;column++){
                if(column%dimension==0) System.out.print(" ");
                System.out.print
                (board[row][column]+" ");
            }
            System.out.println();
        }
    }
    public boolean solve(int row,int column){
        if(row==board.length){
            column++;
            if(column==board.length)    return true;
            else row=0;
        }

        if(board[row][column]!=0)   return solve(row+1,column);

        for(int num=1;num<=board.length;num++){
            if(isValid(row,column,num)){
                board[row][column]=num;
                if(solve(row+1,column)) return true;
                board[row][column]=0;
            }
        }
        return false;
    }
    public boolean isValid(int row,int column,int num){
        for(int i=0;i<board.length;i++){
            if(board[i][column]==num)   return false;
        }
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num) return false;
        }
        int startrow=(row/dimension)*dimension;
        int startcolumn=(column/dimension)*dimension;
        for(int i=startrow;i<startrow+dimension;i++){
            for(int j=startcolumn;j<startcolumn+dimension;j++){
                if(board[i][j]==num)    return false;
            }
        }
        return true;
    }

}
public class Mainclass{
    public static void main(String[] args){
        int board[][]={
            
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        Sudokugame game=new Sudokugame(board);
        game.solve(0,0);
        game.print();


    }
}
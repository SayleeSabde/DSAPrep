import recursions.combinations.NQueens;
import recursions.combinations.RatInMaze;
import recursions.combinations.WordSearch;
import recursions.easy.Atoi;
import recursions.easy.CountGoodNumbers;
import recursions.easy.Power;
import recursions.subsequences.*;

import java.util.Stack;

import static recursions.easy.SortStack.sortStack;

public class DsaMain {
    public static void main(String[] args) {
        int[] arr = {3,10,2,1,1};
        int[][] board = {
                {1, 1, 1}, {1, 0, 1}, {1, 1, 1}
        };

        var list = RatInMaze.findPath(board);

        System.out.println(list);



    }
}

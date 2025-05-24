package recursions.combinations;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/n-queens/description/
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
 * Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.
 */
public class NQueens {

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();

        dfs(board, res, 0);
        return res;
    }

    private static List<String> construct(char[][] board) {
        List < String > res = new ArrayList<>();
        for (char[] chars : board) {
            String s = new String(chars);
            res.add(s);
        }
        return res;
    }

    private static void dfs(char[][] board, List<List<String>> res, int col) {
        if (col == board.length) {
            res.add(construct(board));
            return;
        }
        for (int row = 0;row < board.length;row++) {
            if (validate(board, row, col)) {
                board[row][col] = 'Q';
                dfs(board, res, col+1);
                board[row][col] = '.';
            }
        }
    }

    private static boolean validate(char[][] board, int row, int col) {
        int dupRow = row;
        int dupCol = col;

        while(row >= 0 && col >= 0) {
            if (board[row][col] == 'Q')
                return false;
            row--;
            col--;
        }

        row = dupRow;
        col = dupCol;

        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }
        row = dupRow;
        col = dupCol;

        while (row < board.length && col >= 0) {
            if (board[row][col] == 'Q')
                return false;
            col--;
            row++;
        }

        return true;
    }
}

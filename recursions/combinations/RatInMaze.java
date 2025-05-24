package recursions.combinations;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1&selectedLang=python3
 */
public class RatInMaze {
    private static void dfs(int[][] grid, int i, int j, List<String> res, String str, int n) {
        if (i == n-1 && j == n-1) {
            res.add(str);
            return;
        }
        if (i < 0 || j < 0 || i >= n || j >= n || grid[i][j] == 2 || grid[i][j] == 0) {
            return;
        }
        int x = grid[i][j];
        grid[i][j] = 2;

        dfs(grid, i-1, j, res, str+"U", n);
        dfs(grid, i+1, j, res, str+"D", n);
        dfs(grid, i, j-1, res, str+"L", n);
        dfs(grid, i, j+1, res, str+"R", n);

        grid[i][j] = x;
    }
    public static List<String> findPath(int[][] grid) {
        //your code goes here
        List<String> res = new ArrayList<>();
        String str = "";
        int n = grid.length;
        if (grid[0][0] != 1 || grid[n-1][n-1] == 0) {
            res.add("-1");
        } else {
            dfs(grid, 0, 0, res, str, n);
        }

        return res;

    }
}

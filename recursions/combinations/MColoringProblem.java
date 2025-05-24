package recursions.combinations;

import java.util.Arrays;

/**
 * https://takeuforward.org/plus/dsa/problems/m-coloring-problem
 */
public class MColoringProblem {
    private static boolean solve(int vertex, int[][] graph, int[] colors, int m, int n) {
        if (vertex == n) {
            return true; // All vertices successfully colored
        }

        // Try different colors
        for (int color = 1; color <= m; color++) {
            if (isSafe(vertex, graph, colors, color)) {
                colors[vertex] = color;

                // Recursively color the next vertex
                if (solve(vertex + 1, graph, colors, m, n)) {
                    return true;
                }

                // Backtrack if coloring failed
                colors[vertex] = 0;
            }
        }
        return false;

    }

    private static boolean isSafe(int vertex, int[][] graph, int[] colors, int color) {
        for (int i = 0; i < graph[vertex].length; i++) {
            if (graph[vertex][i] == 1 && colors[i] == color) {
                return false; // Adjacent vertex has the same color
            }
        }
        return true;
    }

    public static boolean graphColoring(int[][] edges, int m, int n) {
        //your code goes here
        int[] colors = new int[n]; // Stores colors assigned to vertices
        Arrays.fill(colors, 0); // Initially, all vertices are uncolored (0)

        int[][] graph = new int[n][n]; // Adjacency matrix representation
        for (int[] edge : edges) {
            graph[edge[0]][edge[1]] = 1;
            graph[edge[1]][edge[0]] = 1;
        }

        // Start coloring from the first vertex
        return solve(0, graph, colors, m, n);

    }

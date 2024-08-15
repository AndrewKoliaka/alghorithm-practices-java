package dailyCodingProblem.matrices;

public class FindIslands {
    public static void main(String args[]) {
        byte[][] map1 = {
                {1, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {1, 1, 0, 0, 1}
        };

        System.out.println(findIslands(map1));
    }

    public static int findIslands(byte[][] grid) {
        int islandCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islandCount++;
                    findNeighboringIsland(grid, i, j);
                }
            }
        }

        return islandCount;
    }

    private static void findNeighboringIsland(byte[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return;
        }
        grid[i][j] = 0;
        findNeighboringIsland(grid, i - 1, j - 1); // up-left;
        findNeighboringIsland(grid, i - 1, j); // up
        findNeighboringIsland(grid, i - 1, j + 1); // up-right;
        findNeighboringIsland(grid, i, j + 1); // right
        findNeighboringIsland(grid, i + 1, j - 1); // down-left
        findNeighboringIsland(grid, i + 1, j); // down
        findNeighboringIsland(grid, i + 1, j + 1); // down-right
        findNeighboringIsland(grid, i, j - 1); // left
    }
}

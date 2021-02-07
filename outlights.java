public class outlights {
    //pole
    private boolean[][] grid;

    public outlights(int size) {
        grid = new boolean[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = false;
            }
        }


    }

    public void random() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (Math.random() > 0.5) {
                    grid[i][j] = true;
                }
            }
        }
    }

    public void onoff(int x, int y) {
        grid[x][y] = !grid[x][y];
        grid[x + 1][y] = !grid[x + 1][y];
        grid[x - 1][y] = !grid[x - 1][y];
        grid[x][y + 1] = !grid[x][y + 1];
        grid[x][y - 1] = !grid[x][y - 1];
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]) {
                    s.append(" # ");
                } else {
                    s.append(" . ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }

}

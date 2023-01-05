public class LatinSquare {
    private int[][] grid;
    private int N;

    public LatinSquare(int[][] grid) {
        this.grid = grid;
        this.N = grid.length;
    }

    public int[][] getGrid() {
        return grid;
    }

    public int getN() {
        return N;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public void setN(int n) {
        N = n;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(grid[i][j]).append(" ");
            }
            sb.append(" \n");
        }
        return sb.toString();
    }

//    public boolean isLatinSquare() {
//        // check if each row has all numbers from 1 to N
//        for (int i = 0; i < N; i++) {
//            if (!isRowValid(i)) {
//                return false;
//            }
//        }
//
//        // check if each column has all numbers from 1 to N
//        for (int i = 0; i < N; i++) {
//            if (!isColumnValid(i)) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public boolean isRowValid(int row) {
//        int[] rowArray = grid[row];
//        return isRowValid(rowArray);
//    }
//
//    public boolean isRowValid(int[] rowArray) {
//        // check if each row has all numbers from 1 to N
//        int[] rowArrayCopy = Arrays.copyOf(rowArray, rowArray.length);
//        Arrays.sort(rowArrayCopy);
//        for (int i = 0; i < N; i++) {
//            if (rowArrayCopy[i] != i + 1) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public boolean isColumnValid(int column) {
//        int[] columnArray = new int[N];
//        for (int i = 0; i < N; i++) {
//            columnArray[i] = grid[i][column];
//        }
//        return isRowValid(columnArray);
//    }
//
//    public boolean isDiagonalValid() {
//        int[] diagonalArray = new int[N];
//        for (int i = 0; i < N; i++) {
//            diagonalArray[i] = grid[i][i];
//        }
//        return isRowValid(diagonalArray);
//    }
//
//    public boolean isAntiDiagonalValid() {
//        int[] antiDiagonalArray = new int[N];
//        for (int i = 0; i < N; i++) {
//            antiDiagonalArray[i] = grid[i][N -
}

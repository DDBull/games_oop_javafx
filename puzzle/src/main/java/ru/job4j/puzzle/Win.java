package ru.job4j.puzzle;

public class Win {

    public static boolean monoHorizontal(int[][] board, int row) {

        if (row < 0 || row >= board.length || board[row].length == 0) {
            return false;
        }

        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] != 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean monoVertical(int[][] board, int column) {

        if (column < 0 || column >= board.length) {
            return false;
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean check(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1
                    && (monoHorizontal(board, i) || monoVertical(board, i))) {
                return true;
            }
        }

        return false;
    }
}

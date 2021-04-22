package ru.job4j.puzzle;

public class Win {
    public static boolean monoVertical(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] != 0) {
                for (int j = 0; j < board.length - 1; j++) {
                    if (board[j][i] == board[j + 1][i] && board[j][i] != 0) {
                        rsl = true;
                    } else {
                        rsl = false;
                        break;
                    }
                }
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] != 0) {
                for (int j = 0; j < board[i].length - 1; j++) {
                    if (board[i][j] == board[i][j + 1] && board[i][j] != 0) {
                        rsl = true;
                    } else {
                        rsl = false;
                        break;
                    }
                }
        }
        }
        return rsl;
    }

        public static boolean check ( int[][] board){
            return monoHorizontal(board) || monoVertical(board);
        }
    }


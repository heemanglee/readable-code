package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.Cell;
import cleancode.minesweeper.tobe.GameException;

public class ConsoleOutputHandler {

    public void showGameStartComments() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("지뢰찾기 게임 시작!");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    /**
     * 파라미터로 row 크기, col 크기, board 인자 세 개를 받을 필요 없이, Cell 객체 하나만 받아서 사용하면 됨
     */
    public void showBoard(Cell[][] board) {
        System.out.println("   a b c d e f g h i j");
        for (int row = 0; row < board.length; row++) {
            System.out.printf("%d  ", row + 1);
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col].getSign() + " ");
            }
            System.out.println();
        }
    }

    public void printGameWinningComment() {
        System.out.println("지뢰를 모두 찾았습니다. GAME CLEAR!");
    }

    public void printGameLosingComment() {
        System.out.println("지뢰를 밟았습니다. GAME OVER!");
    }

    public void printCommentForSelectingCell() {
        System.out.println("선택할 좌표를 입력하세요. (예: a1)");
    }

    public void printCommentForUserAction() {
        System.out.println("선택한 셀에 대한 행위를 선택하세요. (1: 오픈, 2: 깃발 꽂기)");
    }

    public void printExceptionMessage(GameException e) {
        System.out.println(e.getMessage());
    }

    public void printSimpleMessage(String message) {
        System.out.println(message);
    }

}

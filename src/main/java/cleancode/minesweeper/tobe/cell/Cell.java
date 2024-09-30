package cleancode.minesweeper.tobe.cell;

public abstract class Cell {

    protected static final String FLAG_SIGN = "⚑";
    protected static final String UNCHECKED_SIGN = "□";

    protected boolean isFlagged;
    protected boolean isOpened;


    public abstract String getSign();

    public abstract boolean isLandMine();

    public abstract boolean hasLandMineCount();

    public void flag() {
        this.isFlagged = true; // 깃발이 꽂힌 상태
    }

    public boolean isChecked() {
        return isFlagged || isOpened; // 종료 조건 : 모든 셀에 깃발이 꽂혀있거나 열려있는 상태여야 함.
    }

    public void open() {
        this.isOpened = true; // 셀이 열림
    }

    public boolean isOpened() {
        return isOpened;
    }

}

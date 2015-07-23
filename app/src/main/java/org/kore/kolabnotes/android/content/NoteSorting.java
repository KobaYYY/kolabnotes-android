package org.kore.kolabnotes.android.content;

/**
 * Created by koni on 20.07.15.
 */
public final class NoteSorting {
    public enum Direction{
        ASC,DESC;
    }

    private final Direction direction;
    private final String columnName;

    public NoteSorting(String columnName, Direction direction) {
        this.direction = direction;
        this.columnName = columnName;
    }

    public NoteSorting(){
        this(DatabaseHelper.COLUMN_MODIFICATIONDATE,Direction.DESC);
    }

    public Direction getDirection() {
        return direction;
    }

    public String getColumnName() {
        return columnName;
    }

    @Override
    public String toString() {
        return "Ordering{" +
                "direction=" + direction +
                ", columnName='" + columnName + '\'' +
                '}';
    }
}
package Turtle;

public class Position {
    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    @Override
    public String toString() {
        String toString = "Position\n";
        toString += "Current Row Position: " + rowPosition;
        toString += "\nCurrent Column Position: " + columnPosition;
        return toString;
    }

    @Override
    public boolean equals(Object anotherPosition) {
//        this method you can't change it, you are forced to compare it with the object
//        we check if they are of same type, if true, convert to position object to type position, check the variables if they are the same,
//        checking for type
        if(anotherPosition.getClass()!= this.getClass()){
            return false;
        }
        Position convertedPosition = (Position) anotherPosition;
//        if(convertedPosition.columnPosition == this.columnPosition
//                && convertedPosition.columnPosition ==this.rowPosition); or
        boolean rowsAreEqual = convertedPosition.rowPosition ==this.rowPosition;
        boolean columnsAreEqual = convertedPosition.columnPosition == this.columnPosition;
        return columnsAreEqual && rowsAreEqual;
    }
    public void increaseRowPositionBy(int numberOfSteps) {
        rowPosition += numberOfSteps;
    }

    public void increaseColumnPositionBy(int numberOfSteps) {
        columnPosition += numberOfSteps;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }
}

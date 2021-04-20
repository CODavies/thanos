package Turtle;


import static Turtle.Direction.*;

public class Turtle {
    private final Pen pen;
    private Direction currentDirection;
    private final Position currentPosition;

    public Turtle(Pen turtlePen) {
        pen = turtlePen;
        currentDirection = EAST;
        currentPosition = new Position(0, 0);
    }

    public Pen getPen() {
//        Pen pen = new Pen();
        return pen;
    }

    public void movePenUp() {
        pen.setIsUP(true);
    }

    public boolean isPenUp() {
        return pen.isUp();
    }

    public void movePenDown() {
        pen.setIsUP(false);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case EAST -> currentDirection = SOUTH;
            case WEST -> currentDirection = NORTH;
            case SOUTH -> currentDirection = WEST;
            case NORTH -> currentDirection = EAST;

        }
    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> currentDirection = NORTH;
            case NORTH -> currentDirection = WEST;
            case WEST -> currentDirection = SOUTH;
            case SOUTH -> currentDirection = EAST;
        }
    }

    public void moveForward(int numberOfSteps) {
        numberOfSteps = numberOfSteps - 1;
        switch (currentDirection) {
            case EAST, SOUTH -> currentPosition.increaseColumnPositionBy(numberOfSteps);
        }
        switch (currentDirection) {
            case SOUTH, WEST -> currentPosition.increaseRowPositionBy(numberOfSteps);
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }


    public void writeOn(SketchPad sketchPad, int numberOfSteps) {
        if (!isPenUp()) {
            switch (currentDirection) {
                case EAST -> {
                    int counter = 0;
                    while (counter < numberOfSteps) {
                        var floor = sketchPad.getFloor();
                        int rowPosition = currentPosition.getRowPosition();
                        int columnPosition = currentPosition.getColumnPosition();
//                        sketchPad.getFloor()[currentPosition.getRowPosition()][c] = 1;
                        floor[rowPosition][columnPosition + counter] = 1;
                        counter++;
                    }
                }
                case SOUTH, WEST, NORTH -> {
                    int county = 0;
                    while (county < numberOfSteps) {
                        var floor = sketchPad.getFloor();
                        int rowPosition = currentPosition.getRowPosition();
                        int columnPosition = currentPosition.getColumnPosition();
                        floor[rowPosition + county][columnPosition + county] = 1;
                        county++;
                    }
                }
            }
            moveForward(numberOfSteps);
        }

    }


}


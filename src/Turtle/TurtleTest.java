package Turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Turtle.Direction.*;
import static org.junit.jupiter.api.Assertions.*;


public class TurtleTest {

    Pen pen;
    Pen secondPen;
    Turtle ijapa;


    @BeforeEach
    void startAllTestWithThis() {
        pen = new Pen();
        secondPen = new Pen();
        ijapa = new Turtle(pen);

    }
//        The scope here is that there is a pen before the ijapa, therein any ijapa must have a pen following the requirement

    @Test
    void turtleHasAPenTest() {
        assertNotNull(ijapa.getPen());
        assertEquals(pen, ijapa.getPen());
        assertNotEquals(secondPen, ijapa.getPen());
    }

    @Test
    void turtleCanMovePenUp() {
        ijapa.movePenUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    void turtleCanMovePenDown() {
        assertTrue(ijapa.isPenUp());
//            when
        ijapa.movePenDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    void turtleCanTurnRightWhileFacingEast() {
        assertSame(EAST, ijapa.getCurrentDirection());
//        when
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingSouth() {

        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
//        when
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingWest() {

        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
//        when
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingNorth() {
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
//        when
        ijapa.turnRight();
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingEast() {
        assertSame(EAST, ijapa.getCurrentDirection());
//        when
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());

    }

    @Test
    void turtleCanTurnLeftWhileFacingNorth() {
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
//        when
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingWest() {
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
//        when
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingSouth() {
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
//        when
        ijapa.turnLeft();
        assertSame(EAST, ijapa.getCurrentDirection());
    }


    @Test
    void turtleCanMoveForwardFacingEast() {
        assertSame(EAST, ijapa.getCurrentDirection());
//        when
        ijapa.moveForward(5);
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());

    }

    @Test
    void turtleCanMoveForwardFacingSouth() {
        assertSame(EAST, ijapa.getCurrentDirection());
//        when
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.moveForward(5);
        assertEquals(new Position(4, 4), ijapa.getCurrentPosition());

    }

    @Test
    void turtleCanMoveForwardFacingWest() {
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
//        when
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.moveForward(5);
        assertEquals(new Position(4, 0), ijapa.getCurrentPosition());

    }

    @Test
    void turtleCanMoveForwardFacingNorth() {
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
//        when
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.moveForward(5);
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanWriteWhileFacingEastTest() {
        ijapa.movePenDown();
        SketchPad sketchPad = new SketchPad(20, 20);
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, numberOfSteps);
        int counter = 0;
        var floor = sketchPad.getFloor();
        while (counter < numberOfSteps) {

//            var resolves the data type and show it for me.
            assertEquals(1, floor[0][counter]);
            counter++;
        }
     assertEquals(new Position(0,4), ijapa.getCurrentPosition());
    }
    @Test
    void turtleCanWriteWhileFacingSouthTest() {
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.movePenDown();
        SketchPad sketchPad = new SketchPad(20, 20);
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, numberOfSteps);
        int counter = 0;
        var floor = sketchPad.getFloor();
        while (counter < numberOfSteps) {

//            var resolves the data type and show it for me.
            assertEquals(1, floor[counter][counter]);
            counter++;
        }
     assertEquals(new Position(4,4), ijapa.getCurrentPosition());}

        @Test
    void turtleCanWriteWhileFacingWestTest() {
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.movePenDown();
        SketchPad sketchPad = new SketchPad(20, 20);
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, numberOfSteps);
        int counter = 0;
        var floor = sketchPad.getFloor();
        while (counter < numberOfSteps) {

//            var resolves the data type and show it for me.
            assertEquals(1, floor[counter][counter]);
            counter++;
        }
     assertEquals(new Position(4,0), ijapa.getCurrentPosition());
    }
    @Test
    void turtleCanWriteWhileFacingNorthTest() {

        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.movePenDown();
        SketchPad sketchPad = new SketchPad(20, 20);
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, numberOfSteps);
        int counter = 0;
        var floor = sketchPad.getFloor();
        while (counter < numberOfSteps) {

//            var resolves the data type and show it for me.
            assertEquals(1, floor[counter][counter]);
            counter++;
        }
     assertEquals(new Position(0,0), ijapa.getCurrentPosition());
    }
}

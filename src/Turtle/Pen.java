package Turtle;

public class Pen {
    private boolean isDown;

    public void setIsUP(boolean isUp) {
        isDown = !isUp;
    }

    public boolean isUp() {
        return !isDown;
    }

}
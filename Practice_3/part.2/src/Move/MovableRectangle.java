package Move;

public class MovableRectangle extends MovablePoint implements Moveable {
    private MovablePoint topLeft, bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int XSpeed, int YSpeed){
        topLeft = new MovablePoint(x1,y1,XSpeed,YSpeed);
        bottomRight = new MovablePoint(x2,y2,XSpeed,YSpeed);
    }
    @Override
    public String toString(){
        return "Top left point = ( " + this.topLeft.x + ", " + this.topLeft.y + " )" + "; Bottom right point = ( "  + this.bottomRight.x + ", " + this.bottomRight.y + " )" ;
    }
    @Override
    public void moveUp(){
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    @Override
    public void moveDown(){
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    @Override
    public void moveLeft(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    @Override
    public void moveRight(){
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}

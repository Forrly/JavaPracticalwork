package Move;
import java.lang.*;

public class MovablePoint implements Moveable {
    int x,y,xSpeed,ySpeed;
    public MovablePoint( int X,  int Y,  int XSpeed,int YSpeed){
        x = X;
        y = Y;
        xSpeed = XSpeed;
        ySpeed = YSpeed;
    }

    public MovablePoint() {
    }

    public String toString(){
        return "X = " + this.x +","+" Y = " + this.y ;
    }
    public void moveUp(){
        y += ySpeed;
    }

    public void moveDown(){
        y -=  ySpeed;
    }

    public void moveLeft(){
        x -= xSpeed;
    }

    public void moveRight(){
        x +=  xSpeed;
    }
}

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block{

    private int xSpeed;
    private int ySpeed;

    public Ball() {
        super(200, 200);
        xSpeed = 3;
        ySpeed = 1;
    }

    public Ball(int x, int y) {
        super(x, y);
    }

    public Ball(int x, int y, int h, int w) {
        super(x, y, w, h);
    }

    public Ball(int x, int y, int w, int h, Color c) {
        super(x, y, w, h, c);
    }

    public Ball(int x, int y, int w, int h, Color c, int xSp, int ySp) {
        super(x, y, w, h, c);
        xSpeed = xSp;
        ySpeed = ySp;
    }

//  //a
    boolean didCollideLeft(Object obj){
        Block bl = (Block) obj;
        if(this.getY()>=bl.getY()&&this.getY()<=bl.getHeight()||this.getY()+this.getHeight()<=bl.getY()+bl.getHeight()&&this.getY()+this.getHeight()>=bl.getY()){
            if(this.getX() + this.getWidth() == bl.getX() + Math.abs(this.xSpeed)){
                return true;
            }
        }
        return false;  
       
    }
    boolean didCollideRight(Object obj){
        Block bl = (Block) obj;
        if(this.getY()>=bl.getY()&&this.getY()<=bl.getHeight()||this.getY()+this.getHeight()<=bl.getY()+bl.getHeight()&&this.getY()+this.getHeight()>=bl.getY()){
            if(this.getX() == bl.getX() + bl.getWidth()+ Math.abs(this.xSpeed)){
                return true;
            }
        }
        return false;  
       
    }
    boolean didCollideBottom(Object obj){
        Block bl = (Block) obj;
        if(this.getX()>=bl.getX()&&this.getX()<=bl.getWidth()||this.getX()+this.getWidth()<=bl.getX()+bl.getWidth()&&this.getX()+this.getWidth()>=bl.getX()){
            
            if(this.getY() == bl.getY() + bl.getHeight()+ Math.abs(this.ySpeed)){
                return true;
            }
            
        }
        return false;  
       
    }
    boolean didCollideTop(Object obj){
        Block bl = (Block) obj;
        if(this.getX()>=bl.getX()&&this.getX()<=bl.getWidth()||this.getX()+this.getWidth()<=bl.getX()+bl.getWidth()&&this.getX()+this.getWidth()>=bl.getX()){
            
            if(this.getY() + this.getHeight() == bl.getY() + Math.abs(this.ySpeed)){
                return true;
            }
            
        }
        return false;  
       
    }//aend collide 

    //add the other Ball constructors
    //add the set methods
    public void moveAndDraw(Graphics window) {
        //draw a white ball at old ball location

        draw(window, Color.white);
        setxPos(getxPos() + getxSpeed());
		//setY
        setyPos(getyPos() + getySpeed());
        //draw the ball at its new location
        draw(window);

    }

    public boolean equals(Object obj) {
        Ball test = (Ball) obj;
        return super.equals(obj)
                && this.getxSpeed() == test.getxSpeed()
                && this.getySpeed() == test.getySpeed();
    }
    

    //add the get methods
    /**
     * @return the xSpeed
     */
    public int getxSpeed() {
        return xSpeed;
    }

    /**
     * @param xSpeed the xSpeed to set
     */
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * @return the ySpeed
     */
    public int getySpeed() {
        return ySpeed;
    }

    /**
     * @param ySpeed the ySpeed to set
     */
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    
    //add a toString() method
}

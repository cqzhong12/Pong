//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {

    //instance variables

    private int speed;
    private Color color;
            
    public Paddle() {
        super(10, 10);
        speed = 5;
    }
    
    //add the other Paddle constructor
    
    public Paddle (int x, int y){
        super (x,y);
    }
    
    public Paddle (int x, int y, int w){
        super (x, y ,w);
    }
    
    public Paddle (int x, int y, int w, int h, int ySp){
        super (x, y, w, h);
        speed = ySp;
    }
    
    public Paddle (int x, int y, int w, int h, Color c, int ySp){
        super (x, y, w, h, c);
        speed = ySp;
    }
   
    public void moveUpAndDraw(Graphics window) {
        draw(window, Color.white);
        setyPos(getyPos() + getSpeed());
        //draw the ball at its new location
        draw(window);
    }

    public void moveDownAndDraw(Graphics window) {
        setyPos(getyPos() - getSpeed());
        //draw the ball at its new location
        draw(window);
    }

   //add get methods

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    //add a toString() method
    public String toString (){
        return getxPos() + " " + getyPos() + " " + getWidth() + " " + getHeight() + " " + color + " " + getSpeed();
    }
}

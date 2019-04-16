//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable {

    private Ball ball;

    public BallTestTwo() {
        setBackground(Color.WHITE);
        setVisible(true);

		//instantiate a new Ball
		//test the Ball thoroughly
		//test all constructors
        new Thread(this).start();
    }

    public void update(Graphics window) {
        paint(window);
    }

    public void paint(Graphics window) {
        ball.moveAndDraw(window);

        if (!(ball.getxPos() >= 10 && ball.getxPos() <= 550)) {
            ball.setxSpeed(-ball.getxSpeed());
        }

        if (!(ball.getyPos() >= 10 && ball.getyPos() <= 450)) {
            ball.setySpeed(-ball.getySpeed());
        }
    }

    public void run() {
        try {
            while (true) {
                Thread.currentThread().sleep(19);
                repaint();
            }
        } catch (Exception e) {
        }
    }
}

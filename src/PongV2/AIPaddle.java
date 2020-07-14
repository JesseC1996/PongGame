package PongV2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class AIPaddle implements Paddle {
	double y, yVel;
	boolean upAccel, downAccel;
	final double GRAVITY =0.94;
	int player, x;
	Ball b1;
	Random rand = new Random();

	public AIPaddle(int player, Ball b) {
		upAccel = false;
		downAccel = false;
		b1 = b;
		y = 210;
		yVel = 0;
		if (player == 1) {
			x = 0;
		} else {
			x = 680;
		}
	}

	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, (int) y, 20, 80);

	}

	public void move() {
		int  x = rand.nextInt(10) ;		
		y = b1.getY() - x ;
		if(y<0)
			y = 0;
		if(y>420)
			y=420;
	}
 
	 
	public int getY() {

		return (int) y;
	}

}

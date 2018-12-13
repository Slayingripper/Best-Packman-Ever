package core;



import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;


public class Cookie extends Circle {

    private int value;

    public Cookie(double x, double y) {
        this.value =5;
        this.setCenterX(x);
        this.setCenterY(y);
        this.setRadius(12.5);
       // this.setFill(Color.SADDLEBROWN);
        Image cookieicon = new Image("/icon/cookie.png");
        this.setFill(new ImagePattern(cookieicon));
    }
    
    public boolean isTouching(Pacman pacman) {
    	if ((pacman.getCenterX() + pacman.getRadius()) >= this.getCenterX() && (pacman.getCenterX() - pacman.getRadius()) <= this.getCenterX() && (pacman.getCenterY() + pacman.getRadius()) >= this.getCenterY() && (pacman.getCenterY() - pacman.getRadius()) <= this.getCenterY())
    	{
			if (this.isVisible()) {
				return true;
			}
    	}
    	return false;
    }

    public int getValue() {
        return value;
    }

    public void hide() {
        this.setVisible(false);
    }

    public void show() {
        this.setVisible(true);
    }

}
package core;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class Pacman extends Circle {

    public Pacman(double x, double y) {
        this.setCenterX(x);
        this.setCenterY(y);
        this.setRadius(30);
        Image pacmanIcon = new Image("/icon/pacman.gif");
        this.setFill(new ImagePattern(pacmanIcon));
    }
}

package controller;

import data.Point;

/**
 * Created by Bartłomiej Skorowski on 28.01.2020.
 */
public class PointController {

    public void addX (Point p) {
        p.setX(p.getX() + 1);
    }

    public void minusX (Point p) {
        p.setX(p.getX() - 1);

    }

    public void addY (Point p) {
        p.setY(p.getY() + 1);

    }

    public void minusY (Point p) {
        p.setY(p.getY() - 1);

    }

    public void changePoint (Point p){
        p = new Point(-100, -100);
    }
}

package app;

import data.Point;
import controller.PointController;

/**
 * Created by Bartłomiej Skorowski on 28.01.2020.
 */
public class PointApplication {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        PointController pc = new PointController();

        System.out.println("Punkt: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.addX(p1);
        System.out.println("Punkt addX: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.addY(p1);
        pc.addY(p1);
        pc.addY(p1);
        pc.addY(p1);
        System.out.println("Punkt addY: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.minusX(p1);
        System.out.println("Punkt minusX: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.minusY(p1);
        System.out.println("Punkt minusY: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.changePoint(p1);
        System.out.println("Punkt changePoint: (" + p1.getX() + ";" + p1.getY() + ")");
    }
}

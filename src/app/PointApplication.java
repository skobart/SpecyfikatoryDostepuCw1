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

        final int addX = 0;
        final int addY = 1;
        final int minusX = 2;
        final int minusY = 3;

        int option = addX;
        switch (option) {
            case addX:
                pc.addX(p1);
                break;
            case addY:
                pc.addY(p1);
                break;
            case minusX:
                pc.minusX(p1);
                break;
            case minusY:
                pc.minusY(p1);
                break;
            default:
                System.out.println("Podano błędną wartość lub jej brak");
        }

        System.out.println("Punkt po zmianie: (" + p1.getX() + ";" + p1.getY() + ")");
    }
}

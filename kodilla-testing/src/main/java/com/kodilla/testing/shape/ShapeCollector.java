package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    public ArrayList<Shape> list = new ArrayList<>();

    public void addFigure(Shape shape) {
        list.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (list.contains(shape)) {
            list.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return list.get(n);
    }

    public int showFigures() {
        return list.size();
    }
}

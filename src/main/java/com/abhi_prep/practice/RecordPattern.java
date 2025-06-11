package com.abhi_prep.practice;

public class RecordPattern {

    public static String describePoint(Point point) {
        return switch (point) {
            case Point(int x, int y) -> "Point with coordinates: (" + x + ", " + y + ")";
            default -> "Unknown point";
        };
    }

    public static void main(String[] args) {
        Point p1 = new Point(5, 10);
        Point p2 = new Point(-3, 7);

        System.out.println(describePoint(p1));
        System.out.println(describePoint(p2));
    }
}

record Point(int x, int y) {
}


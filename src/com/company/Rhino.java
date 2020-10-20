package com.company;

import java.awt.*;

public class Rhino {
    private final int length, height, x, y;

    public Rhino(int length, int height, int x, int y) {
        this.length = length;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        body(g);
        legs(g);
        head(g);
    }

    private void head(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillPolygon(
                new int[]{
                        length / 5 + x,
                        length / 40 + x,
                        x,
                        length / 6 + x,
                        length / 5 + x
                },
                new int[]{
                        27 * height / 40 + y,
                        7 * height / 10 + y,
                        height / 2 + y,
                        height / 3 + y,
                        y
                },
                5
        );
        g.setColor(Color.WHITE);
        g.fillPolygon(
                new int[]{
                        x,
                        x,
                        length / 18 + x
                },
                new int[]{
                        height / 2 + y,
                        y,
                        4 * height / 9 + y
                },
                3
        );
        g.fillOval(11 * length / 60 + x, height / 3 + y, length / 50, length / 50);
        g.setColor(Color.BLUE);
        g.fillOval(45 * length / 240 + x, height / 3 + length / 240 + y, length / 100, length / 100);
        g.setColor(Color.BLACK);
        g.drawLine(x, height / 2 + y, length / 6 + x, height / 3 + y);
        g.drawLine(length / 6 + x, height / 3 + y, length / 5 + x, y);
        g.drawLine(x, height / 2 + y, length / 40 + x, 7 * height / 10 + y);
        g.drawLine(length / 40 + x, 7 * height / 10 + y, length / 5 + x, 27 * height / 40 + y);

        g.drawLine(x, height / 2 + y, x, y);
        g.drawLine(x, y, length / 18 + x, 4 * height / 9 + y);

        g.drawOval(11 * length / 60 + x, height / 3 + y, length / 50, length / 50);
        g.drawOval(45 * length / 240 + x, height / 3 + length / 240 + y, length / 100, length / 100);
    }

    private void body(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawPolyline(
                new int[]{
                        length / 5 + x,
                        11 * length / 50 + x,
                        12 * length / 50 + x,
                        45 * length / 50 + x,
                        47 * length / 50 + x,
                        length + x,
                        length + x,
                        length / 5 + x
                },
                new int[]{
                        y,
                        y,
                        height / 30 + y,
                        height / 25 + y,
                        height / 3 + y,
                        height / 2 + y,
                        27 * height / 40 + y,
                        27 * height / 40 + y
                },
                8
        );
        g.setColor(Color.GRAY);
        g.fillPolygon(
                new int[]{
                        length / 5 + x,
                        11 * length / 50 + x,
                        12 * length / 50 + x,
                        45 * length / 50 + x,
                        47 * length / 50 + x,
                        length + x,
                        length + x,
                        length / 5 + x
                },
                new int[]{
                        y,
                        y,
                        height / 30 + y,
                        height / 25 + y,
                        height / 3 + y,
                        height / 2 + y,
                        27 * height / 40 + y,
                        27 * height / 40 + y
                },
                8
        );
    }

    private void legs(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(length / 4 + x, height / 2 + y, length / 10, height / 2);
        g.fillRect(9 * length / 10 + x, height / 2 + y, length / 10, height / 2);
        g.setColor(Color.WHITE);
        g.fillArc(length / 4 + x, 9 * height / 10 + y, length / 30, height / 5, 0, 180);
        g.fillArc(length / 4 + length / 30 + x, 9 * height / 10 + y, length / 30, height / 5, 0, 180);
        g.fillArc(length / 4 + length / 15 + x, 9 * height / 10 + y, length / 30, height / 5, 0, 180);

        g.fillArc(9 * length / 10 + x, 9 * height / 10 + y, length / 30, height / 5, 0, 180);
        g.fillArc(9 * length / 10 + length / 30 + x, 9 * height / 10 + y, length / 30, height / 5, 0, 180);
        g.fillArc(9 * length / 10 + length / 15 + x, 9 * height / 10 + y, length / 30, height / 5, 0, 180);

        g.setColor(Color.BLACK);
        g.drawRect(length / 4 + x, height / 2 + y, length / 10, height / 2);
        g.drawRect(9 * length / 10 + x, height / 2 + y, length / 10, height / 2);

        g.drawArc(length / 4 + x, 9 * height / 10 + y, length / 30, height / 5, 0, 180);
        g.drawArc(length / 4 + length / 30 + x, 9 * height / 10 + y, length / 30, height / 5, 0, 180);
        g.drawArc(length / 4 + length / 15 + x, 9 * height / 10 + y, length / 30, height / 5, 0, 180);

        g.drawArc(9 * length / 10 + x, 9 * height / 10 + y, length / 30, height / 5, 0, 180);
        g.drawArc(9 * length / 10 + length / 30 + x, 9 * height / 10 + y, length / 30, height / 5, 0, 180);
        g.drawArc(9 * length / 10 + length / 15 + x, 9 * height / 10 + y, length / 30, height / 5, 0, 180);
    }
}

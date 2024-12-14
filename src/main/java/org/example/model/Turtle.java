package org.example.model;

public class Turtle extends Entity {
    public Turtle(int x, int y) {
        super("Черепаха", x, y);
    }

    @Override
    public void move() {
        int direction = (int) (Math.random() * 3); // 0 - вверх, 1 - вправо, 2 - влево
        switch (direction) {
            case 0:
                if (y < fieldHeigth) {
                    ++y;
                }
                break;
            case 1:
                if (x < fieldWidth) {
                    ++x;
                }
                break;
            case 2:
                if (x > 0) {
                    --x;
                }
                break;
        }
    }
}
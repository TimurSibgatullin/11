package org.example.model;

public class Grasshopper extends Entity {
    public Grasshopper(int x, int y) {
        super("Кузнечик", x, y);
    }

    @Override
    public void move() {
        int direction = (int) (Math.random() * 3); // 0 - два вперёд, 1 - вправо, 2 - влево
        switch (direction) {
            case 0:
                if (y + 2 <= fieldHeigth) {
                    y += 2;
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